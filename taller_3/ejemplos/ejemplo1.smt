; ejemplo1
(declare-const x Bool)
(declare-const y Bool)
(assert ( = (not(and x y)) (or (not x)(not y))))
(check-sat)
