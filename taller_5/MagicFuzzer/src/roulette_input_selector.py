from typing import Set
from fuzzingbook.Coverage import Location
from fuzzingbook.GreyboxFuzzer import getPathID


class RouletteInputSelector:

    def __init__(self, exponent: int):
        """Guarda el exponente"""
        pass

    def add_new_execution(self, s: str, s_path: Set[Location]):
        """Agrega una nueva ejecución del input s y su path"""
        pass

    def get_frequency(self, s: str) -> int:
        """Retorna la cantidad de apariciones del path_id de s. Retorna 0 si el input no fue ejecutado"""
        pass

    def get_energy(self, s: str) -> float:
        """Retorna el valor actual de e(s). Levanta una excepción si el input no fue ejecutado"""
        pass

    def select(self) -> str:
        """Elije aleatoriamente un s usando seleccion de ruleta sobre e(s)"""
        pass