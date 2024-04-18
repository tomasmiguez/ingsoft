#!./venv/bin/python
import unittest

from random import seed
from src.create_population import create_population
from src.crossover import crossover


class TestCrossover(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        population = create_population(2)
        crossover(population[0], population[1])
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)