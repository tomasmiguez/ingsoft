from random import random
from src.create_population import create_population
from src.crossover import crossover
from src.evaluate_population import evaluate_population
from src.mutate import mutate
from src.selection import selection


class GeneticAlgorithm:
    def __init__(self):
        self.population_size = 100
        self.tournament_size = 5
        self.p_crossover = 0.70
        self.p_mutation = 0.20

        self.generation = 0
        self.best_individual = None
        self.fitness_best_individual = None

    def get_best_individual(self):
        return self.best_individual

    def get_fitness_best_individual(self):
        return self.fitness_best_individual

    def get_generation(self):
        return self.generation

    def run(self, log=False):
        # Generar y evaluar la poblacion inicial
        population = create_population(self.population_size)
        fitness_by_individual = evaluate_population(population)

        # Imprimir el mejor valor de fitness encontrado
        self.best_individual = min(fitness_by_individual, key=fitness_by_individual.get)
        self.fitness_best_individual = fitness_by_individual[self.best_individual]

        if log:
            print(
                f"Generation {self.generation:4} | Fitness {round(self.fitness_best_individual,2):4}: {self.best_individual}"
            )

        # Continuar mientras la cantidad de generaciones es menor que 500
        # y no haya ningun individuo que cubra todos los objetivos

        while self.generation < 500 and self.fitness_best_individual != 0:
            if random() < self.p_crossover:
                parent1 = selection(fitness_by_individual, self.tournament_size)
                parent2 = selection(fitness_by_individual, self.tournament_size)
                index_parent1 = population.index(parent1)
                index_parent2 = population.index(parent2)
                child1, child2 = crossover(parent1, parent2)
                if random() < self.p_mutation:
                    child1 = mutate(child1)
                    child2 = mutate(child2)
                population[index_parent1] = child1
                population[index_parent2] = child2

            self.generation += 1

            # Evaluar la nueva poblacion e imprimir el mejor valor de fitness
            fitness_by_individual = evaluate_population(population)
            self.best_individual = min(
                fitness_by_individual, key=fitness_by_individual.get
            )
            self.fitness_best_individual = fitness_by_individual[self.best_individual]

            if log:
                print(
                    f"Generation {self.generation:4} | Fitness {round(self.fitness_best_individual, 2):4}: {self.best_individual}"
                )

        # retornar el mejor individuo de la ultima generacion
        return self.best_individual
