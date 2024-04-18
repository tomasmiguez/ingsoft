#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        cgi_decode("Hello World")
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)