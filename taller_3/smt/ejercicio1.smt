(declare-const x Bool)
(declare-const y Bool)
; a)
; ¬(x ∧ y) ≡ (¬x ∨ ¬y)
(assert ( = (not (and x y)) (or (not x) (not y))))
(check-sat)

; b)
; (x ∧ y) ≡ ¬(¬x ∨ ¬y)
(assert ( = (and x y) (not (or (not x) (not y)))))
(check-sat)

; c)
; ¬(x ∧ y) ≡ ¬(¬x ∧ ¬y)
(assert ( = (not (and x y)) (not (or (not x) (not y)))))
(check-sat)