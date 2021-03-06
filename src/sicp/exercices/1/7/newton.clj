(ns sicp.exercices.1.7.newton
  (:import (java.lang.Math))
  )

(defn average
  [x y]
  (/ (+ x y) 2))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn good-enough?
  [oldGuess guess]
  (<
    (Math/abs (- guess oldGuess))
    (* guess 0.001))
  )

(defn sqrt-iter [guess oldGuess x]
  (if (good-enough? oldGuess guess)
    guess
    (sqrt-iter (improve guess x) guess
               x)
    ))

(defn sqrt [x]
  (sqrt-iter 1.0 2.0 x)
  )
