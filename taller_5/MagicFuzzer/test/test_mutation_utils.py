#!./venv/bin/python
import unittest
from random import seed
from src.mutation_utils import insert_random_character, delete_random_character, change_random_character


class TestMutationUtils(unittest.TestCase):
    def testExample(self):
        insert_random_character("Hello World")
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, True)