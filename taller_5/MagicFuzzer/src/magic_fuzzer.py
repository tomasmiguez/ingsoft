from random import choice
from typing import List, Set
from fuzzingbook.Coverage import Location
from fuzzingbook.MutationFuzzer import FunctionCoverageRunner
from src.mutation_utils import (
    insert_random_character,
    delete_random_character,
    change_random_character,
)
from src.roulette_input_selector import RouletteInputSelector
from src.get_source_lines import get_source_lines


class MagicFuzzer:
    def __init__(
        self, initial_inputs, function_to_call, function_name_to_call=None
    ) -> None:
        """Ejecuta inputs iniciales, almacenando la cobertura obtenida"""
        self.initial_inputs = initial_inputs
        self.contributing_inputs = dict()
        self.covered_locations = set()
        self.function_to_call = function_to_call
        self.function_name_to_call = function_name_to_call
        self.lines = get_source_lines(function_to_call) - 1

        self.feed_fuzzer(initial_inputs)

    def get_contributing_inputs(self) -> List[str]:
        """Retorna la lista de los inputs que aumentaron la cobertura en el orden que fueron ejecutados"""
        return list(self.contributing_inputs.keys())

    def get_covered_locations(self) -> Set[Location]:
        """Retorna el conjunto de locaciones cubiertas de todas las ejecuciones"""
        return self.covered_locations

    def mutate(self, s: str) -> str:
        """Aplica al azar alguna de las tres operaciones de mutacion definidas en el archivo mutation_utils.py"""
        possible_mutations = [
            insert_random_character,
            delete_random_character,
            change_random_character,
        ]
        return choice(possible_mutations)(s)

    def feed_fuzzer(self, inputs: List[str]) -> None:
        """
        Agrega nuevos inputs al fuzzer y ejecuta los que aumentan la cobertura
        """
        runner = FunctionCoverageRunner(self.function_to_call)

        for input in inputs:
            runner.run(input)

            previous_coverage = len(self.covered_locations)

            new_covered_locations = set(
                filter(lambda x: x[0] == self.function_name_to_call, runner.coverage())
            ) if self.function_name_to_call is not None else runner.coverage()

            self.covered_locations = self.covered_locations.union(new_covered_locations)

            if len(self.covered_locations) > previous_coverage:
                self.contributing_inputs[input] = new_covered_locations

    def fuzz(self):
        """
        Elije aleatoriamente un input s usando seleccion de ruleta sobre e(s),
        muta el input s utilizando la función mutate(s), y ejecuta el s mutado
        """
        selector = RouletteInputSelector(2)
        for input, covered_locations in self.contributing_inputs.items():
            selector.add_new_execution(input, covered_locations)

        selected_input = selector.select()
        mutated_input = self.mutate(selected_input)

        self.feed_fuzzer([mutated_input])

    def run_until_covered(self) -> int:
        """
        Corre una campaña del MagicFuzzer hasta cubrir todas las lineas del programa.
        Retorna la cantidad de iteraciones realizadas.
        """
        iterations = 0

        while len(self.covered_locations) < self.lines:
            self.fuzz()
            iterations += 1

        return iterations

    def run_iterations(self, n: int) -> int:
        """
        Corre una campaña del MagicFuzzer por n iteraciones.
        """
        iterations = 0

        while iterations < n:
            self.fuzz()
            iterations += 1

        return len(self.covered_locations)
