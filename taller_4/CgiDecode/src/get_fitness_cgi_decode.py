from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_false_distance, get_true_distance

def get_fitness_cgi_decode(test_suite):
    CONDS_NUM = 5

    best_true_dists = [1 for _ in range(CONDS_NUM)]
    best_false_dists = [1 for _ in range(CONDS_NUM)]

    for test_case in test_suite:
        try:
            cgi_decode_instrumented(test_case)
        finally:
            for cond_num in range(CONDS_NUM):
                true_dist = get_true_distance(cond_num)
                if true_dist is not None:
                    normalized_dist = true_dist / (true_dist + 1)
                    if normalized_dist < best_true_dists[cond_num]:
                        best_true_dists[cond_num] = normalized_dist

                false_dist = get_false_distance(cond_num)
                if false_dist is not None:
                    normalized_dist = false_dist / (false_dist + 1)
                    if normalized_dist < best_false_dists[cond_num]:
                        best_false_dists[cond_num] = normalized_dist

            clear_maps()

            continue

    return sum(best_true_dists) + sum(best_false_dists)
