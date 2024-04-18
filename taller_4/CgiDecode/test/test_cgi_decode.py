#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def testEmptyString(self):
        self.assertEqual(cgi_decode(""), "")
    
    def testSpaces(self):
        self.assertEqual(cgi_decode("Hello+World"), "Hello World")
    
    def testHexValues(self):
        self.assertEqual(cgi_decode('%0e'), chr(14))

    def testWrongFirstDigit(self):
        self.assertRaises(ValueError, cgi_decode, '%g0')
    
    def testWrongSecondDigit(self):
        self.assertRaises(ValueError, cgi_decode, '%0g')
