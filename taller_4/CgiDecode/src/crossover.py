from random import randint

def crossover(parent1, parent2):
    crossover_point = randint(1, min(len(parent1), len(parent2)))

    offspring1 = parent1[:crossover_point] + parent2[crossover_point:]
    offspring2 = parent2[:crossover_point] + parent1[crossover_point:]

    return offspring1, offspring2
