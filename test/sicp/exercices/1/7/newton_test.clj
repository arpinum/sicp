(ns sicp.exercices.1.7.newton-test
    (:require [clojure.test :refer :all])
    (:require [sicp.exercices.1.7.newton :refer :all]))

(deftest newton

  (testing "sqrt"
    (is (= 1.4142135623746899 (sqrt 2 )))
    )
  )

(deftest sqrt-test
  )
