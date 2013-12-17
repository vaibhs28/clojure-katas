(ns clojure-katas.nth-fibonacci)
; return nth fibonacci number

(defn nth-fib-tree
  "run time: O(2^n), calling itself at each recursion"
  [n]
  (loop [n n]
    (cond
      (< n 0) 0
      (= n 0) 1
      (= n 1) 1
      :else (+ (nth-fib-tree (- n 1)) (nth-fib-tree (- n 2))))))

(defn fib-iter
  "x: first start num,
   y: second start num,
   n: nth iterative, stopping num"
   [x y n]
   (loop [x x
          y y
          n n]
     (cond
       (< n 0) 0
       (= n 0) x
       :else (fib-iter (+ x y) x (- n 1)))))

(defn nth-fib-iter
  "run time: O(n) iterate n times"
  [n]
  (fib-iter 1 0 n)
)