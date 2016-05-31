(ns rna-transcription)

(def translation {\C \G, \G \C, \A \U, \T \A})

(defn to-rna [input]
  (def translated (apply str (map translation input)))
  (if (= (count translated) (count input))
    translated
    (throw (AssertionError. "Invalid DNA input.")))
)
