(declare-const a1 Int)
(declare-const a2 Int)
(declare-const a3 Int)
; 16 mod 2
; 16 dividido por 4
; El resto de la division entera de 16 por 5.
(assert (= a1 (mod 2 16)))
(assert (= a2 (div 16 4)))
(assert (= a3 (rem 16 5)))
(check-sat)
(get-model)

; sat
; (
;   (define-fun a2 () Int
;     4)
;   (define-fun a3 () Int
;     1)
;   (define-fun a1 () Int
;     2)
; )