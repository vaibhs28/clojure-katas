(ns clojure-katas.levenshtein
  (:require [clojure-katas.core :as core]))

(core/defproblem levenshtein
  "Compute the amount of difference between two sequences,
   also known as edit distance. For example, the edit distance
   between kitten and sitten is 1 because we can simply replace
   k with s; the edit distance between hi and hit is 1 because
   we can remove t at the end of t"
  [str1 str2]
(cond 
    (empty? str1) (count str2)
    (empty? str2) (count str1)
    :else (let [cost (if (= (first str1) (first str2)) 0 1)]
            (min (inc (levenshtein (rest str1) str2))
                 (inc (levenshtein str1 (rest str2)))
                 (+ (levenshtein (rest str1) (rest str2)) cost)))))

