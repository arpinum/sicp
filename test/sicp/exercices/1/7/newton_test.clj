(ns sicp.exercices.1.7.newton-test
    (:require [clojure.test :refer :all])
    (:require [sicp.exercices.1.7.newton :refer :all]))

(deftest newton

  (testing "sqrt"
    (is (= 577/408 (sqrt-iter 1 2 )))
    )
  )
