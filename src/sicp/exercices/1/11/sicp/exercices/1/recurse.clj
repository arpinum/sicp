(ns sicp.exercices.1.11.sicp.exercices.1.recurse)


(defn f-recurse [n]
  (if (< n 3)
    n
    (+ (f-recurse (- n 1)) (f-recurse (- n 2)) (f-recurse (- n 3)))))

(defn f-iter [n]

  (defn f-iter-recur [count a b c]
    (if (= count 0) c
                    (recur (- count 1) (+ a b c) a b)
                    ))

  (f-iter-recur n (bigint 2) (bigint 1) (bigint 0)))
