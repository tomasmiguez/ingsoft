#!./venv/bin/python

from math import isclose

import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode

class TestGetFitnessCgiDecode(unittest.TestCase):
    def assertExpectedFitness(self, test_suite, expected_fitness):
        fitness = get_fitness_cgi_decode(test_suite)

        if expected_fitness is None:
            print(fitness)
            return

        self.assertTrue(isclose(fitness, expected_fitness, abs_tol=0.01),
                        f'We expected a fitness of {round(expected_fitness, 2)} but got {round(fitness, 2)}')

    def testValidHexValue(self):
        self.assertExpectedFitness(["%AA"], 2.35)

    def testInvalidHexValueSecondDigit(self):
        self.assertExpectedFitness(["%AU"], 3.53)

    def testInvalidHexValueFirstDigit(self):
        self.assertExpectedFitness(["%UU"], 5.03)

    def testPlus(self):
        self.assertExpectedFitness(["Hello+Reader"], 4.97)

    def testEmptyString(self):
        self.assertExpectedFitness([""], 8.5)

    def testMissingDigitsHexValue(self):
        self.assertExpectedFitness([" %"], 5.35)

    def testMissingDigitHexValue(self):
        self.assertExpectedFitness([" %1"], 5.52)

    def testOnlyPlus(self):
        self.assertExpectedFitness(["+"], 6.5)

    def testPlusAndMissingDigitHexValue(self):
        self.assertExpectedFitness(["+ %1"], 4.66)

    def testPlusAsSecondDigitHexValue(self):
        self.assertExpectedFitness([" %1+"], 2.94)

    def testExtraEmptyStringSameFitness(self):
        fitness = get_fitness_cgi_decode(["%AA"])

        fitness_with_empty = get_fitness_cgi_decode(["%AA", ""])

        self.assertEqual(fitness, fitness_with_empty)

    def testTwoStringsLeqEachAlone(self):
        fitness1 = get_fitness_cgi_decode(["%AA"])
        fitness2 = get_fitness_cgi_decode([" %1+"])

        fitness_with_both = get_fitness_cgi_decode(["%AA", " %1+"])

        self.assertLessEqual(fitness_with_both, fitness1)
        self.assertLessEqual(fitness_with_both, fitness2)

