def tournamentWinner(competitions, results):
    totals = {}

    for idx, match in enumerate(competitions):

        match_result = results[idx]
        winner_selector = 1 if match_result == 0 else 0
        match_winner = match[winner_selector]

        winner_score = totals.get(match_winner)
        if not winner_score:
            winner_score = 0

        totals[match_winner] = winner_score + 3

    return sorted(totals.items(), key=lambda item: item[1], reverse=True)[0][0]
