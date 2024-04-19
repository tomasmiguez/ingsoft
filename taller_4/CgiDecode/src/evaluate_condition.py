import sys
from typing import Dict

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}
K = 1


def update_maps(condition_num, d_true, d_false):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num):
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num):
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num):
    global distances_true, distances_false
    return (
        condition_num in distances_true.keys()
        or condition_num in distances_false.keys()
    )


def evaluate_condition(condition_num, op, lhs, rhs):
    d_true = 0
    d_false = 0
    if type(lhs) == str:
        lhs = ord(lhs)
    if type(rhs) == str:
        rhs = ord(rhs)
    if op == "Eq":
        d_true = abs(lhs - rhs)
        d_false = 0 if lhs != rhs else K
    elif op == "Ne":
        d_true = 0 if lhs != rhs else K
        d_false = abs(lhs - rhs)
    elif op == "Lt":
        d_true = 0 if lhs < rhs else lhs - rhs + K
        d_false = 0 if lhs >= rhs else rhs - lhs
    elif op == "Gt":
        d_true = 0 if lhs > rhs else rhs - lhs + K
        d_false = 0 if lhs <= rhs else lhs - rhs
    elif op == "Le":
        d_true = 0 if lhs <= rhs else lhs - rhs
        d_false = 0 if lhs > rhs else rhs - lhs + K
    elif op == "Ge":
        d_true = 0 if lhs >= rhs else rhs - lhs
        d_false = 0 if lhs < rhs else lhs - rhs + K
    elif op == "In":
        d_true = min([abs(el - lhs) for el in rhs]) if rhs else sys.maxsize
        d_false = 0 if lhs not in rhs else K
    else:
        raise NotImplementedError("Operator not supported")
    update_maps(condition_num, d_true, d_false)
    return d_true == 0
