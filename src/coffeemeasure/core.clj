;; A small app to calculate how many grams of coffee are needed to
;; make a given amount of coffee in ounces. Also to figure out
;; mechanics of clojure projects.

(ns coffeemeasure.core)

;; Coffee to water ratio
(def RATIO 17.1)

(defn oz2g
  "Convert x ounces to grams"
  [x]
  (* x 28.3495))

(defn g2oz
  "Convert x grams to ounces"
  [x]
  (* x 0.035274))

(defn coffeemeasure
  "Calculate the number of grams of coffee needed to make oz ounces"
  [oz]
  (java.lang.Math/ceil (/  (oz2g oz) RATIO)))
