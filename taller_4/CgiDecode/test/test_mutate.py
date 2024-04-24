#!./venv/bin/python
import unittest

from random import seed
from src.create_population import create_population
from src.mutate import mutate


class TestMutate(unittest.TestCase):
    def testOneMutation(self):
        population = create_population(1)
        individual = population[0]
        mutated_individual = mutate(individual)
        difference = set(individual) - set(mutated_individual)

        self.assertAlmostEqual(len(individual), len(mutated_individual), delta=1)
        self.assertTrue(len(difference) <= 1)
