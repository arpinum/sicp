(ns sicp.exercices.1.8.newton-cube-test
  (:require [clojure.test :refer :all])
  (:require [sicp.exercices.1.8.newton-cube :refer [cuberoots]])
  (:import (java.lang.Math))
  )

(defn absolute-difference ^double [^double x ^double y]
  (Math/abs (double (- x y))))

(defn close? [tolerance x y]
  (< (absolute-difference x y) tolerance))


(deftest newton-cube

  (testing cuberoots
    (is (close? 0.001 3 (cuberoots 27)))
    ))
