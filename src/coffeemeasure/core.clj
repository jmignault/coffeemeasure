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
  "How many grams of coffee makes x ounces"
  [x]
  (java.lang.Math/ceil (/  (oz2g x) RATIO)))
