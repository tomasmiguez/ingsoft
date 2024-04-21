#!./venv/bin/python
import unittest

from src.crossover import crossover

class TestCrossover(unittest.TestCase):
    def testWithEqualParents(self):
        result = crossover(("foo", "bar"), ("baz", "bam"))

        possible_results = [
            (("foo", "bar"), ("baz", "bam")),
            (("foo", "bam"), ("baz", "bar")),
        ]

        self.assertIn(result, possible_results)

    def testWithLongerParent(self):
        result = crossover(("foo",), ("baz", "bam"))

        possible_results = [
            (("foo",), ("baz", "bam")),
            (("foo", "bam"), ("baz",)),
        ]

        self.assertIn(result, possible_results)
