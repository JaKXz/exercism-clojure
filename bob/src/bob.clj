(ns bob
  (:require [clojure.string :refer [
    blank?,
    ends-with?,
    lower-case,
    trim,
    upper-case
  ]]))

(defn is-shouting [input]
  (and
    (= (upper-case input) input)
    (not= (lower-case input) input)
  )
)

(defn response-for [input]
  (cond
    (blank? input) "Fine. Be that way!"
    (is-shouting input) "Whoa, chill out!"
    (ends-with? (trim input) "?") "Sure."
    :else "Whatever."
  )
)
