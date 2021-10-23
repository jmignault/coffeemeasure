;; Simple tests for coffeemeasure project.

(ns coffeemeasure.core-test
  (:require [clojure.test :refer :all]
            [coffeemeasure.core :refer :all]))

(deftest oz2g-test
  (testing "Test ounces to grams"
    (is (= (oz2g 16) 454))))

(deftest g2oz-test
  (testing "Test grams to ounces"
    (is (= (g2oz 454) 16.014396))))

(deftest coffeemeasure-test
  (testing "Test coffeemeasure"
    (is (= (coffeemeasure 454) 29))))

(deftest coffeeprint-test
  (testing "Test coffeeprint"
    (is (= (coffeeprint 16) "454g (16 oz) of made coffee requires 29g of ground coffee."))))

(deftest coffeeprintg-test
  (testing "Test coffeeprintg"
    (is (= (coffeeprintg 454) "454g of made coffee requires 29g of ground coffee."))))
