#!./venv/bin/python
import unittest
from random import seed
from src.mutation_utils import (
    insert_random_character,
    delete_random_character,
    change_random_character,
)


class TestMutationUtils(unittest.TestCase):
    def setUp(self):
        seed(1)

    def testInsertRandomCharacter(self):
        self.assertEqual(insert_random_character("Hello World"), "He+llo World")

    def testDeleteRandomCharacter(self):
        self.assertEqual(delete_random_character("Hello World"), "Helo World")

    def testChangeRandomCharacter(self):
        self.assertEqual(change_random_character("Hello World"), "He+lo World")

    def testDeleteRandomCharacterEmptyString(self):
        self.assertEqual(delete_random_character(""), "")

    def testChangeRandomCharacterEmptyString(self):
        self.assertEqual(change_random_character(""), "")
