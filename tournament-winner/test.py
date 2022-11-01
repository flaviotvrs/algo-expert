import unittest
import solution1
import solution2
import time


class Solution1TestCase(unittest.TestCase):

    def test_case_1(self):

        competitions = [
            ["HTML", "C#"],
            ["C#", "Python"],
            ["Python", "HTML"],
        ]
        results = [0, 0, 1]

        start = time.perf_counter()
        winner = solution1.tournamentWinner(competitions, results)
        end = time.perf_counter()
        print(f"Finished in {round(end - start, 2)} second(s)")
        self.assertEqual(winner, "Python")


class Solution2TestCase(unittest.TestCase):

    def test_case_1(self):

        competitions = [
            ["HTML", "C#"],
            ["C#", "Python"],
            ["Python", "HTML"],
        ]
        results = [0, 0, 1]
        start = time.perf_counter()
        winner = solution2.tournamentWinner(competitions, results)
        end = time.perf_counter()
        print(f"Finished in {round(end - start, 2)} second(s)")
        self.assertEqual(winner, "Python")


if __name__ == '__main__':
    unittest.main()
