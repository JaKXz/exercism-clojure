(ns bob)

(defn is-shouting [input]
  (and
    (= (clojure.string/upper-case input) input)
    (not= (clojure.string/lower-case input) input)
  )
)

(defn is-question [input]
  (and
    (> (count input) 1)
    (= (subs (clojure.string/reverse input) 0 1) "?")
  )
)

(defn is-silence [input]
  (= (clojure.string/trim input) "")
)

(defn response-for [input]
  (cond
    (is-shouting input) "Whoa, chill out!"
    (is-question input) "Sure."
    (is-silence input) "Fine. Be that way!"
    :else "Whatever."
  )
)
