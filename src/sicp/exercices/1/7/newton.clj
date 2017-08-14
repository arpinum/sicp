(ns sicp.exercices.1.7.newton
  (:import (java.lang.Math))
  )

(defn average
  [x y]
  (/ (+ x y) 2))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn square [x] (Math/pow x 2))

(defn good-enough?
  [guess x]
  (< (Math/abs (- (square guess) x)) 0.001))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)
    ))
