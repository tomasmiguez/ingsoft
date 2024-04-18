#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def testExample(self):
        # COMPLETAR
        cgi_decode_instrumented("Hello+Reader")
        self.assertTrue(True)
        self.assertFalse(False)
        self.assertEqual(True, False)