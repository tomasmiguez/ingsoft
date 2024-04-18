#!./venv/bin/python
import unittest
from random import seed
from src.create_population import create_population


class TestCreatePopulation(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        create_population(5)
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)