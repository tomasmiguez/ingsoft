#!./venv/bin/python
import unittest
from src.evaluate_population import evaluate_population


class TestEvaluatePopulation(unittest.TestCase):
    def test(self):
        expected_fitnesses = {
            tuple(["%AA"]): 2.36,
            tuple(["%AU"]): 3.53,
            tuple([""]): 8.5,
            tuple([" %"]): 5.36,
            tuple([" %1"]): 5.52,
            tuple(["+"]): 6.5,
            tuple(["+ %1"]): 4.67,
            tuple([" %1+"]): 2.94,
            tuple(["%AA", ""]): 2.36
        }

        rounded_result = {k: round(v, 2) for k, v in evaluate_population(expected_fitnesses.keys()).items()}

        self.assertDictEqual(rounded_result, expected_fitnesses)
