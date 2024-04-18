#!./venv/bin/python
import unittest

from src.create_population import create_population
from src.evaluate_population import evaluate_population
from src.selection import selection


class TestSelection(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        population = create_population(5)
        fitness_by_individual = evaluate_population(population)
        selection(fitness_by_individual)
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)