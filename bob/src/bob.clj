(ns bob
  (:require [clojure.string :as str]))

(defn is-shouting [input]
  (and
    (= (str/upper-case input) input)
    (not= (str/lower-case input) input)
  )
)

(defn is-question [input]
  (= (subs (str/reverse input) 0 1) "?")
)

(defn response-for [input]
  (def new-input (str/trim input))
  (cond
    (= "" new-input) "Fine. Be that way!"
    (is-shouting new-input) "Whoa, chill out!"
    (is-question new-input) "Sure."
    :else "Whatever."
  )
)
