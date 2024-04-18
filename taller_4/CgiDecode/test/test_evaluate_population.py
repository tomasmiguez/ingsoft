#!./venv/bin/python
import unittest
from src.create_population import create_population
from src.evaluate_population import evaluate_population


class TestEvaluatePopulation(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        population = create_population(5)
        evaluate_population(population)
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)