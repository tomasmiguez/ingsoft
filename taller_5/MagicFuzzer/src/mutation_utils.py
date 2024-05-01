from random import choice, randint
from string import printable


def insert_random_character(s: str) -> str:
    """Retorna s con un caracter random insertado en una posicion al azar"""
    position = randint(0, len(s))
    return s[:position] + choice(printable) + s[position:]


def delete_random_character(s: str) -> str:
    """Retorna s con un caracter random eliminado.
    Si la cadena esta vacia, no la modifica"""
    if len(s) == 0:
        return s
    position = randint(0, len(s) - 1)
    return s[:position] + s[position + 1 :]


def change_random_character(s: str) -> str:
    """Retorna s con un caracter modificado en una posicion al azar.
    El caracter a modificar es reemplazado por otro caracter random.
    Si la cadena esta vacia, no la modifica."""
    if len(s) == 0:
        return s
    position = randint(0, len(s) - 1)
    return s[:position] + choice(printable) + s[position + 1 :]
