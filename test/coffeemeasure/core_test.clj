(ns coffeemeasure.core-test
  (:require [clojure.test :refer :all]
            [coffeemeasure.core :refer :all]))

(deftest oz2g-test
  (testing "Test ounces to grams"
    (is (= (oz2g 16) 453.592))))

(deftest g2oz-test
  (testing "Test grams to ounces"
    (is (= (g2oz 454) 16.014396))))

(deftest coffemeasure-test
  (testing "Test coffeemeasure"
    (is (= (coffeemeasure 16) 27.0))))
