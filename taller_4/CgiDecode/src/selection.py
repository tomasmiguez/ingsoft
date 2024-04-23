import random

def selection(fitness_by_individual, tournament_size):
    participants = {k: fitness_by_individual[k] for k in random.sample(fitness_by_individual.keys(), tournament_size)}

    winner = min(participants, key = participants.get)

    return winner
