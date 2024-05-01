from typing import List, Set
from fuzzingbook.Coverage import Location
from fuzzingbook.MutationFuzzer import FunctionCoverageRunner


class MagicFuzzer:
    def __init__(
        self, initial_inputs, function_to_call, function_name_to_call=None
    ) -> None:
        """Ejecuta inputs iniciales, almacenando la cobertura obtenida"""
        self.initial_inputs = initial_inputs
        self.contributing_inputs = []
        self.covered_locations = set()
        self.function_to_call = function_to_call
        self.function_name_to_call = function_name_to_call

        runner = FunctionCoverageRunner(self.function_to_call)

        for input in initial_inputs:
            runner.run(input)
            previous_coverage = len(self.covered_locations)
            self.covered_locations = self.covered_locations.union(
                set(
                    filter(
                        lambda x: x[0] == self.function_name_to_call, runner.coverage()
                    )
                )
            )
            if len(self.covered_locations) > previous_coverage:
                self.contributing_inputs.append(input)

    def get_contributing_inputs(self) -> List[str]:
        """Retorna la lista de los inputs que aumentaron la cobertura en el orden que fueron ejecutados"""
        return self.contributing_inputs

    def get_covered_locations(self) -> Set[Location]:
        """Retorna el conjunto de locaciones cubiertas de todas las ejecuciones"""
        return self.covered_locations

    def mutate(self, s: str) -> str:
        """Aplica al azar alguna de las tres operaciones de mutacion definidas en el archivo mutation_utils.py"""
        pass

    def fuzz(self):
        """
        Elije aleatoriamente un input s usando seleccion de ruleta sobre e(s),
        muta el input s utilizando la función mutate(s), y ejecuta el s mutado
        """
        pass

    def run_until_covered(self) -> int:
        """
        Corre una campania del MagicFuzzer hasta cubrir todas las lineas del programa.
        Retorna la cantidad de iteraciones realizadas.
        """
        pass

    def run_iterations(self, n: int) -> None:
        """
        Corre una campaña del MagicFuzzer por n iteraciones.
        """
        pass
