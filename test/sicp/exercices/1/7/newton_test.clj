(ns newton-test
    (:require [clojure.test :refer :all])
    (:require [newton :refer :all]))

(deftest newton

  (testing "sqrt"
    (is (= 577/408 (sqrt-iter 1 2 )))
    )
  )
