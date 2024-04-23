#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def assertExpectedDistances(self, exp_true_map, exp_false_map):
        for cond_num, distance in exp_true_map.items():
            self.assertEqual(get_true_distance(cond_num), distance)
        for cond_num, distance in exp_false_map.items():
            self.assertEqual(get_false_distance(cond_num), distance)

    def assertExpectedResultAndDistances(self, input, exp_true_map, exp_false_map):
        clear_maps()
        self.assertEqual(cgi_decode_instrumented(input), cgi_decode(input))
        self.assertExpectedDistances(exp_true_map, exp_false_map)

    def assertRaisesAndExpectedDistances(self, input, exp_true_map, exp_false_map):
        clear_maps()
        self.assertRaises(ValueError, cgi_decode_instrumented, input)
        self.assertExpectedDistances(exp_true_map, exp_false_map)

    def testEmptyString(self):
        self.assertExpectedResultAndDistances(
            input="", exp_true_map={0: 1}, exp_false_map={0: 0}
        )

    def testSpaces(self):
        self.assertExpectedResultAndDistances(
            input="Hello+World",
            exp_true_map={0: 0, 1: 0, 2: 35},
            exp_false_map={0: 0, 1: 0, 2: 0},
        )

    def testHexValues(self):
        self.assertExpectedResultAndDistances(
            input="%0e",
            exp_true_map={0: 0, 1: 6, 2: 0, 3: 0, 4: 0},
            exp_false_map={0: 0, 1: 0, 2: 1, 3: 1, 4: 1},
        )

    def testWrongFirstDigit(self):
        self.assertRaisesAndExpectedDistances(
            input="%g0",
            exp_true_map={0: 0, 1: 6, 2: 0, 3: 1},
            exp_false_map={0: 3, 1: 0, 2: 1, 3: 0},
        )

    def testWrongSecondDigit(self):
        self.assertRaisesAndExpectedDistances(
            input="%0g",
            exp_true_map={0: 0, 1: 6, 2: 0, 3: 0, 4: 1},
            exp_false_map={0: 3, 1: 0, 2: 1, 3: 1, 4: 0},
        )
