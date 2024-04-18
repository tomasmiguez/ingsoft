#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode


class TestGetFitnessCgiDecode(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        get_fitness_cgi_decode(["%AA"])
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)