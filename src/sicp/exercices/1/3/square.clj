(ns sicp.exercices.1.3.square)

(defn square [x] (* x x))

(defn sum-of-squares
  "summing squares"
  [x y]
  (+ (square x) (square y))
  )

(defn my-min [x y]
  (if (< x y) x y)
  )
(defn my-max
  "max"
  [x y]
  (if (> y x) y x)
  )

(defn sum-of-max
  [x y z]
  (sum-of-squares (my-max x y)
                  (my-max (my-min y z) x))
  )
