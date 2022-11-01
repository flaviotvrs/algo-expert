def tournamentWinner(competitions, results):
    totals = {}
    current_winner = None
    current_winner_score = 0

    for idx, match in enumerate(competitions):

        match_result = results[idx]
        winner_selector = 1 if match_result == 0 else 0
        match_winner = match[winner_selector]

        winner_score = totals.get(match_winner)
        if not winner_score:
            winner_score = 0

        current_score = winner_score + 3
        if current_score > current_winner_score:
            current_winner = match_winner
            current_winner_score = current_score

        totals[match_winner] = current_score

    return current_winner
