from typing import List, Set
from fuzzingbook.Coverage import Location


class MagicFuzzer:
    def __init__(self, initial_inputs, function_to_call, function_name_to_call = None) -> None:
        """Ejecuta inputs iniciales, almacenando la cobertura obtenida"""
        pass

    def get_contributing_inputs(self) -> List[str]:
        """Retorna la lista de los inputs que aumentaron la cobertura en el orden que fueron ejecutados"""
        pass

    def get_covered_locations(self) -> Set[Location]:
        """Retorna el conjunto de locaciones cubiertas de todas las ejecuciones"""
        pass

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