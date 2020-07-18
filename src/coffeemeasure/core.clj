;; A small app to calculate how many grams of coffee are needed to
;; make a given amount of coffee in ounces. Also to figure out
;; mechanics of clojure projects.

(ns coffeemeasure.core)

;; Coffee to water ratio
(def RATIO 16.1)

(defn oz2g
  "Convert oz ounces to grams"
  [oz]
  (int (java.lang.Math/ceil (* oz 28.3495))))

(defn g2oz
  "Convert g grams to ounces"
  [g]
  (* g 0.035274))

(defn coffeemeasure
  "Calculate the number of grams of coffee for g grams of water"
  [g]
  (int (java.lang.Math/ceil (/ g RATIO))))

(defn -main []
  (println (coffeemeasure 800))) ;; 6-cup Chemex to bead
                                        ; 
