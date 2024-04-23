from random import choice, randint
from src.create_population import create_test_case, get_random_character


def modify_character(test_case, position):
    return test_case[:position] + get_random_character() + test_case[position + 1 :]


def add_character(test_case, position):
    return test_case[:position] + get_random_character() + test_case[position:]


def remove_character(test_case, position):
    return test_case[:position] + test_case[position + 1 :]


def modify_test_case(individual, position):
    old_test_case = individual[position]

    if len(old_test_case) == 0:
        possible_modifications = [add_character]
    elif len(old_test_case) < 10:
        possible_modifications = [modify_character, add_character, remove_character]
    else:
        possible_modifications = [modify_character, remove_character]

    position_to_modify = randint(0, max(len(old_test_case) - 1, 0))
    new_test_case = choice(possible_modifications)(old_test_case, position_to_modify)

    return individual[:position] + (new_test_case,) + individual[position + 1 :]


def add_test_case(individual, position):
    return individual[:position] + (create_test_case(),) + individual[position:]


def remove_test_case(individual, position):
    return individual[:position] + individual[position + 1 :]


def mutate(individual):
    if len(individual) == 0:
        possible_mutations = [add_test_case]
    elif len(individual) < 15:
        possible_mutations = [modify_test_case, add_test_case, remove_test_case]
    else:
        possible_mutations = [modify_test_case, remove_test_case]

    position_to_modify = randint(0, max(len(individual) - 1, 0))
    mutated_individual = choice(possible_mutations)(individual, position_to_modify)

    return mutated_individual
