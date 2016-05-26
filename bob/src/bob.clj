(ns bob
  (:require [clojure.string :refer [upper-case, lower-case, blank?]]))

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
    (.endsWith input "?") "Sure."
    :else "Whatever."
  )
)
