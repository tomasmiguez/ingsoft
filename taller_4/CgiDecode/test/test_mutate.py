#!./venv/bin/python
import unittest

from random import seed
from src.create_population import create_population
from src.mutate import mutate


class TestMutate(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        population = create_population(1)
        mutate(population[0])
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)