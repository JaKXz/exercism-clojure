(ns word-count
  (:require [clojure.string :refer [lower-case]]))

(defn word-count
  [input]
  ; `inc` uses the {} as a function to return the existing value in the result
  ; hash (or starts it at 0), returns the incremented value to `assoc` which
  ; then gives the word key its incremented value.
  (reduce #(assoc %1 %2 (inc (%1 %2 0)))
    {}
    (re-seq #"\w+" (lower-case input))))
