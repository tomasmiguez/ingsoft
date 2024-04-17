(declare-const n Int)

(declare-const C1_1 Bool)
(declare-const C1_2 Bool)
(declare-const C1_3 Bool)
(declare-const C2_3 Bool)

(assert (= C1_1 (< 0 n)))
(assert (= C1_2 (< 1 n)))
(assert (= C1_3 (< 2 n)))

(assert C1_1)
(assert C1_2)

(check-sat)
(get-model)
