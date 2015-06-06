(ns clojure-katas.exponential
  (:require [clojure-katas.core :as core]))

(core/defproblem expt-linear
  "b^n = b*b^(n-1)
   b^0 = 1"
  [base index]
(cond 
    (= index 0) 1
    :else (* base (expt-linear base (dec index)))
    )
)

(core/defproblem expt-fast
  "b^n = (b^(n/2))^2 if n is even
   b^n = b*b^(n-1) if n is odd"
   [base index]
(cond
     (= index 0) 1
     (even? index) (expt-fast (expt-fast base (/ index 2)) 2)
     :else (* base (expt-fast base (dec index)))
     )
   )
