; ejemplo2
(declare-const x Bool)
(declare-const y Bool)
(assert ( = x true))
(assert ( = y false))
(assert ( = x y))
(check-sat)
