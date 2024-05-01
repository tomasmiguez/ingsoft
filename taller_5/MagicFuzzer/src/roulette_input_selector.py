from typing import Set
from fuzzingbook.Coverage import Location
from fuzzingbook.GreyboxFuzzer import getPathID

from random import choices


class RouletteInputSelector:

    def __init__(self, exponent: int):
        """Guarda el exponente"""
        self.exponent = exponent
        self.paths = dict()

    def add_new_execution(self, s: str, s_path: Set[Location]):
        """Agrega una nueva ejecución del input s y su path"""
        self.paths[s] = getPathID(s_path)

    def get_frequency(self, s: str) -> int:
        """Retorna la cantidad de apariciones del path_id de s. Retorna 0 si el input no fue ejecutado"""
        if s not in self.paths:
            return 0
        return len([v for v in self.paths.values() if self.paths[s] in v])

    def get_energy(self, s: str) -> float:
        """Retorna el valor actual de e(s). Levanta una excepción si el input no fue ejecutado"""
        frequency = self.get_frequency(s)
        if frequency == 0:
            raise Exception(f"El input '{s}' no fue ejecutado")
        return 1 / (frequency**self.exponent)

    def select(self) -> str:
        """Elije aleatoriamente un s usando seleccion de ruleta sobre e(s)"""
        energies = {s: self.get_energy(s) for s in self.paths.keys()}
        return choices(list(energies.keys()), weights=list(energies.values()))[0]
