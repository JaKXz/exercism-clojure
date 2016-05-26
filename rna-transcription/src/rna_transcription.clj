(ns rna-transcription
  (:require [clojure.string :refer [join, split]]))

(def translation
  {"C" "G", "G" "C", "A" "U", "T" "A"}
)

(defn to-rna [input]
  (def dna-chars (split input #""))
  (assert (every? translation dna-chars) "Invalid DNA strand.")
  (join "" (map translation dna-chars))
)
