from src.get_fitness_cgi_decode import get_fitness_cgi_decode

def evaluate_population(population):
    fitness = {}

    for test_suite in population:
        fitness[test_suite] = get_fitness_cgi_decode(test_suite)

    return fitness
