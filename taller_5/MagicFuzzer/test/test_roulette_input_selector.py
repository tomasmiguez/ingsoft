#!./venv/bin/python
import unittest
from src.roulette_input_selector import RouletteInputSelector


class TestRouletteInputSelector(unittest.TestCase):

    def test(self):
        selector = RouletteInputSelector(2)

        selector.add_new_execution("good", {("crashme", 2)})
        selector.add_new_execution("goo", {("crashme", 2)})
        selector.add_new_execution("go", {("crashme", 2)})
        selector.add_new_execution("b", {("crashme", 2), ("crashme", 3)})
        selector.add_new_execution("bx", {("crashme", 2), ("crashme", 3)})
        selector.add_new_execution("by", {("crashme", 2), ("crashme", 3)})
        selector.add_new_execution("bad", {("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5)})

        self.assertEqual(selector.get_frequency("good"), 3)
        self.assertEqual(selector.get_frequency("goo"), 3)
        self.assertEqual(selector.get_frequency("go"), 3)
        self.assertEqual(selector.get_frequency("b"), 3)
        self.assertEqual(selector.get_frequency("bx"), 3)
        self.assertEqual(selector.get_frequency("by"), 3)
        self.assertEqual(selector.get_frequency("bad"), 1)

        self.assertAlmostEqual(selector.get_energy("good"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("goo"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("go"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("b"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("bx"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("by"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("bad"), 1/(1**2), places=2)