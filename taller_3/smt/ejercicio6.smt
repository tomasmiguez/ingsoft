(declare-const k Real)

(declare-const C1_1 Bool)
(declare-const C2_1 Bool)
(declare-const C1_2 Bool)
(declare-const C2_2 Bool)
(declare-const C1_3 Bool)
(declare-const C2_3 Bool)

(assert (= C1_1 (< 0 3)))
(assert (= C2_1 (= (+ 5.0 k) 0)))
(assert (= C1_2 (< 1 3)))
(assert (= C2_2 (= (+ 1.0 k) 0)))
(assert (= C1_3 (< 2 3)))
(assert (= C2_3 (= (+ 3.0 k) 0)))

(assert C1_1)
(assert (not C2_1))

(check-sat)
(get-model)

; (assert C1_1)
; (assert (not C2_1))
; (assert C1_2)
; (assert (not C2_2))
; (assert C1_3)
; (assert C2_3)
