#!./venv/bin/python
import sys
import unittest
from src.evaluate_condition import (
    evaluate_condition,
    get_false_distance,
    get_true_distance,
)


class TestEvaluateCondition(unittest.TestCase):
    def assertExpectedDistances(
        self, condition_num, op, lhs, rhs, exp_true, exp_false, exp_return
    ):
        self.assertEqual(evaluate_condition(condition_num, op, lhs, rhs), exp_return)
        self.assertEqual(get_false_distance(condition_num), exp_false)
        self.assertEqual(get_true_distance(condition_num), exp_true)

    def testEqualTrue(self):
        self.assertExpectedDistances(
            condition_num=1,
            op="Eq",
            lhs=20,
            rhs=10,
            exp_true=10,
            exp_false=0,
            exp_return=False,
        )

    def testEqualFalse(self):
        self.assertExpectedDistances(
            condition_num=2,
            op="Eq",
            lhs=20,
            rhs=20,
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testNotEqualTrue(self):
        self.assertExpectedDistances(
            condition_num=3,
            op="Ne",
            lhs=20,
            rhs=10,
            exp_true=0,
            exp_false=10,
            exp_return=True,
        )

    def testNotEqualFalse(self):
        self.assertExpectedDistances(
            condition_num=4,
            op="Ne",
            lhs=20,
            rhs=20,
            exp_true=1,
            exp_false=0,
            exp_return=False,
        )

    def testLowerEqualTrue(self):
        self.assertExpectedDistances(
            condition_num=5,
            op="Le",
            lhs=10,
            rhs=20,
            exp_true=0,
            exp_false=11,
            exp_return=True,
        )

    def testLowerEqualFalse(self):
        self.assertExpectedDistances(
            condition_num=6,
            op="Le",
            lhs=20,
            rhs=10,
            exp_true=10,
            exp_false=0,
            exp_return=False,
        )

    def testLowerEqualEqual(self):
        self.assertExpectedDistances(
            condition_num=7,
            op="Le",
            lhs=20,
            rhs=20,
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testLowerTrue(self):
        self.assertExpectedDistances(
            condition_num=8,
            op="Lt",
            lhs=10,
            rhs=20,
            exp_true=0,
            exp_false=10,
            exp_return=True,
        )

    def testLowerFalse(self):
        self.assertExpectedDistances(
            condition_num=9,
            op="Lt",
            lhs=20,
            rhs=10,
            exp_true=11,
            exp_false=0,
            exp_return=False,
        )

    def testLowerEqual(self):
        self.assertExpectedDistances(
            condition_num=10,
            op="Lt",
            lhs=20,
            rhs=20,
            exp_true=1,
            exp_false=0,
            exp_return=False,
        )

    def testInEmpty(self):
        self.assertExpectedDistances(
            condition_num=11,
            op="In",
            lhs=10,
            rhs=[],
            exp_true=sys.maxsize,
            exp_false=0,
            exp_return=False,
        )

    def testInFalse(self):
        self.assertExpectedDistances(
            condition_num=12,
            op="In",
            lhs=10,
            rhs=[1, 2, 3],
            exp_true=7,
            exp_false=0,
            exp_return=False,
        )

    def testInTrue(self):
        self.assertExpectedDistances(
            condition_num=13,
            op="In",
            lhs=10,
            rhs=[10],
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testTrueDuplicated(self):
        self.assertExpectedDistances(
            condition_num=14,
            op="In",
            lhs=10,
            rhs=[10, 10],
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testFalseNear(self):
        self.assertExpectedDistances(
            condition_num=15,
            op="In",
            lhs=13,
            rhs=[11, 12, 18],
            exp_true=1,
            exp_false=0,
            exp_return=False,
        )

    def testGreaterFalse(self):
        self.assertExpectedDistances(
            condition_num=16,
            op="Gt",
            lhs=10,
            rhs=20,
            exp_true=11,
            exp_false=0,
            exp_return=False,
        )

    def testGreaterTrue(self):
        self.assertExpectedDistances(
            condition_num=17,
            op="Gt",
            lhs=20,
            rhs=10,
            exp_true=0,
            exp_false=10,
            exp_return=True,
        )

    def testGreaterEqualFalse(self):
        self.assertExpectedDistances(
            condition_num=18,
            op="Ge",
            lhs=10,
            rhs=20,
            exp_true=10,
            exp_false=0,
            exp_return=False,
        )

    def testGreaterEqualTrue(self):
        self.assertExpectedDistances(
            condition_num=19,
            op="Ge",
            lhs=20,
            rhs=10,
            exp_true=0,
            exp_false=11,
            exp_return=True,
        )

    def testGreaterEqualEqual(self):
        self.assertExpectedDistances(
            condition_num=20,
            op="Ge",
            lhs=20,
            rhs=20,
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testCharEqualTrue(self):
        self.assertExpectedDistances(
            condition_num=21,
            op="Eq",
            lhs="A",
            rhs="A",
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testCharListInTrue(self):
        self.assertExpectedDistances(
            condition_num=22,
            op="In",
            lhs="A",
            rhs=["A", "B"],
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testCharDictInTrue(self):
        self.assertExpectedDistances(
            condition_num=22,
            op="In",
            lhs="A",
            rhs={"A": 1, "B": 2},
            exp_true=0,
            exp_false=1,
            exp_return=True,
        )

    def testNotImplementedOperator(self):
        self.assertRaises(NotImplementedError, evaluate_condition, 21, "XX", 10, 20)
