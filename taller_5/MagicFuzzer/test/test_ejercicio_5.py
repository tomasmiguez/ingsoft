#!./venv/bin/python
from random import seed
import unittest
from src.magic_fuzzer import MagicFuzzer
from src.my_parser import my_parser
from parameterized import parameterized


class TestEjercicio5(unittest.TestCase):

    @parameterized.expand(
        [
            [12, 487],
            [24, 166],
            [32, 135],
        ]
    )
    def test(
        self,
        seed_value,
        expected_covered_locations,
    ):
        seed(seed_value)
        fuzzer = MagicFuzzer([""], my_parser)

        covered_locations = fuzzer.run_iterations(5000)

        self.assertEqual(covered_locations, expected_covered_locations)
