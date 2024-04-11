; ejemplo6
(declare-const a Int)
(declare-const r1 Int)
(declare-const r2 Int)
(declare-const r3 Int)
(declare-const b Real)
(declare-const c Real)
(assert (= a 10))
(assert (= r1 (div a 4))); integer division
(assert (= r2 (mod a 4))); mod
(assert (= r3 (rem a 4))); remainder
(assert (>= b (/ c 3.0)))
(assert (>= c 20.0))
(check-sat)
(get-model)