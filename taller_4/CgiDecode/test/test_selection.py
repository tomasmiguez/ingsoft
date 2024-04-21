#!./venv/bin/python
import unittest

from src.selection import selection


class TestSelection(unittest.TestCase):
    PARTICIPANTS = {
            tuple([""]): 8.5,
            tuple(["+"]): 6.5,
            tuple([" %"]): 5.36,
            tuple([" %1"]): 5.52,
            tuple(["+ %1"]): 4.67,
            tuple(["%AU"]): 3.53,
            tuple([" %1+"]): 2.94,
            tuple(["%AA"]): 2.36,
        }

    def testFullTournamentReturnsBest(self):
        winner = selection(self.PARTICIPANTS, len(self.PARTICIPANTS))

        self.assertEqual(winner, tuple(["%AA"]))

    def testPartialTournamentIsGoodEnough(self):
        winner = selection(self.PARTICIPANTS, 6)

        self.assertIn(winner, [tuple(["%AU"]), tuple([" %1+"]), tuple(["%AA"])])
