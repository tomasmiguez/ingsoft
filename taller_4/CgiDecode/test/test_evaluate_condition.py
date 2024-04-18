#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition


class TestEvaluateCondition(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        evaluate_condition(1, "Eq", 10, 20)
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)