from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_false_distance, get_true_distance


def get_fitness_cgi_decode(test_suite, coverage=False):
    clear_maps()

    CONDS_NUM = 5

    best_true_dists = [1 for _ in range(CONDS_NUM)]
    best_false_dists = [1 for _ in range(CONDS_NUM)]

    true_coverage = [0 for _ in range(CONDS_NUM)]
    false_coverage = [0 for _ in range(CONDS_NUM)]

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

                if coverage:
                    if true_dist == 0:
                        true_coverage[cond_num] = 1
                    if false_dist == 0:
                        false_coverage[cond_num] = 1

            clear_maps()

            continue
    if coverage:
        return (sum(true_coverage) + sum(false_coverage)) / (CONDS_NUM * 2)
    return sum(best_true_dists) + sum(best_false_dists)
