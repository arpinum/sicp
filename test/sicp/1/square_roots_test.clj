(ns square-roots-test
  (:require [clojure.test :refer :all])
  (:require [square-roots :refer :all]))

(deftest square-roots
  (testing "compute squares"
    (is (= 4 (square 2))))

  (testing "sum of squares"
    (is (= 13 (sum-of-squares 2 3))))

  (testing "min"
    (is (= 1 (my-min 1 2)))
    )

  (testing "max"
    (is (= 3 (my-max 3 1))))

  (testing "sum-of-max"
    (is (= 13 (sum-of-max 2 3 1)))
    )
  )

