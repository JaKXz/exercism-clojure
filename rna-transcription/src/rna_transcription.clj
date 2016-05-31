(ns rna-transcription)

(def translation {\C \G, \G \C, \A \U, \T \A})

(defn translator
  [c]
  (or
    (translation c)
    (throw (AssertionError. "Invalid DNA input."))))

(defn to-rna
  [input]
  (apply str (map translator input)))
