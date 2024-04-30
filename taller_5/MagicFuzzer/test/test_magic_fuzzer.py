#!./venv/bin/python
import unittest
from src.magic_fuzzer import MagicFuzzer
from src.crashme import crashme
from parameterized import parameterized


class TestMagicFuzzer(unittest.TestCase):

    @parameterized.expand([
        [[], [], []],
        [["good"], [("crashme", 2)], ["good"]],
        [["bad!"], [("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5), ("crashme", 6)], ["bad!"]],
        [["good", "goo"], [("crashme", 2)], ["good"]],
        [["good", "bad!"], [("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5), ("crashme", 6)], ["good", "bad!"]],
        [["bad!", "good"], [("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5), ("crashme", 6)], ["bad!"]],
        [["good", "b", "ba"], [("crashme", 2), ("crashme", 3), ("crashme", 4)], ["good", "b", "ba"]],
        [["good", "b", "bad!"], [("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5), ("crashme", 6)], ["good", "b", "bad!"]],
        [["good", "go", "b", "bad!"], [("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5), ("crashme", 6)], ["good", "b", "bad!"]],
    ])
    def test(self, inputs, expected_covered_locations, expected_contributing_inputs):
        fuzzer = MagicFuzzer(inputs, crashme, function_name_to_call="crashme")
        self.assertSetEqual(fuzzer.get_covered_locations(), set(expected_covered_locations))
        self.assertListEqual(fuzzer.get_contributing_inputs(), expected_contributing_inputs)