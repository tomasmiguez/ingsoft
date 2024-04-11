; ejemplo5
(declare-fun x () Int)
(declare-fun y () Int)
(assert (= (+ x y) 10))
(assert (= (+ x (* 2 y)) 20))
(check-sat)
(get-model)