#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm
from src.get_fitness_cgi_decode import get_fitness_cgi_decode


class TestGeneticAlgorithm(unittest.TestCase):
    def testConvergesIn68Generations(self):
        seed(2)
        ga = GeneticAlgorithm()
        result = ga.run()
        coverage = get_fitness_cgi_decode(result, coverage=True)
        self.assertEqual(coverage, 1.0)
        self.assertEqual(ga.get_generation(), 68)
        self.assertEqual(
            result,
            (
                "%fFBv",
                "#PC`!%4n",
                "YT\\\x0c;_.G",
                "0",
                "q",
                "Lg'\x0b%JAh",
                "=LfXPh}",
                '~?("3',
                "~A+",
            ),
        )

    def testDoesNotConverge(self):
        seed(3)
        ga = GeneticAlgorithm()
        result = ga.run()
        coverage = get_fitness_cgi_decode(result, coverage=True)
        self.assertEqual(coverage, 0.8)
        self.assertEqual(ga.get_generation(), 1000)
        self.assertEqual(
            result,
            (
                ">",
                "}EB",
                "y&shtp",
                "\n.T",
                "`I",
                "MB\x0b!&r",
                "w0#P^&",
                "\x0cTj?I%9A",
                "K",
                "oe;+7k",
                "uW` y",
                "JN",
                "U7@?W",
            ),
        )

    def testConvergesIn256Generations(self):
        seed(5)
        ga = GeneticAlgorithm()
        result = ga.run()
        coverage = get_fitness_cgi_decode(result, coverage=True)
        self.assertEqual(coverage, 1.0)
        self.assertEqual(ga.get_generation(), 256)
        self.assertEqual(
            result,
            (
                "xK^;+",
                "",
                "/Gej,e<3",
                "F%OJEy>r-",
                "L\x0bgB@o",
                "TK%4.,r nO",
                "oU1",
                "%az/^Y$",
                "`\x0bb,eBQH8%",
                "S",
                "LsO",
                "^%",
                "(@c] >I",
                "Y%1C1*l:k",
            ),
        )
