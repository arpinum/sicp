(ns sicp.exercices.1.8.newton-cube
  (:import (java.lang.Math)))

(defn square [x] (Math/pow x 2))

(defn improve
  [guess x]
  (/
    (+ (/ x (square guess)) (* 2 guess))
    3))

(defn good-enough?
  [oldGuess guess]
  (<
    (Math/abs (- guess oldGuess))
    (* guess 0.001))
  )

(defn cuberoots-iter [guess oldGuess x]
  (if (good-enough? oldGuess guess)
    guess
    (cuberoots-iter (improve guess x) guess
                    x)
    ))

(defn cuberoots [x]
  (cuberoots-iter 1 2 x))
