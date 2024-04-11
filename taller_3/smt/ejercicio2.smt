(declare-const x Int)
(declare-const y Int)
; a-
; 3x + 2y = 36
(assert (= (+ (* 3 x) (* 2 y)) 36))
(check-sat)
(get-model)

; b-
; 5x + 4y = 64
(assert (= (+ (* 5 x) (* 4 y)) 64))
(check-sat)
(get-model)

; c-
; x ∗ y = 64
(assert (= (* x y) 64))
(check-sat)
(get-model)