(ns sicp.exercices.1.10.sicp.exercices.1.10.ackermann)

(defn A [x y]
  (cond
    (= y 0) y
    (= x 0) (* 2 y)
    (= y 1) 2
    :else (A (- x 1)
             (A x (- y 1)))
    )
  )
