from random import seed
import unittest
from src.magic_fuzzer import MagicFuzzer
from src.crashme import crashme
from parameterized import parameterized


class TestEjercicio4(unittest.TestCase):

    @parameterized.expand(
        [
            [12, ["", "b", "ba", "bad", "bad!"], 5, 4756],
            [26, ["", "b", "ba", "bad", "bad!"], 5, 4590],
            [37, ["", "b", "ba", "bad", "bad!"], 5, 7927],
        ]
    )
    def test(
        self,
        seed_value,
        expected_contributing_inputs,
        expected_input_quantity,
        expected_iterations_until_covered,
    ):
        seed(seed_value)
        fuzzer = MagicFuzzer([""], crashme, function_name_to_call="crashme")
        iterations_until_covered = fuzzer.run_until_covered()

        self.assertListEqual(
            fuzzer.get_contributing_inputs(), expected_contributing_inputs
        )
        self.assertEqual(len(fuzzer.get_contributing_inputs()), expected_input_quantity)
        self.assertEqual(iterations_until_covered, expected_iterations_until_covered)
