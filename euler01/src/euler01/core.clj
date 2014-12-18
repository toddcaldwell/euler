(ns euler01.core
  (:gen-class))

(defn isMultiple
  "Return true if num is a multiple of any of the provided numbers.  False otherwise."
  [num factor]
  (if (= (mod num factor) 0)
    true
    false))

(defn sumMultiplesOverRange
  ([currentNum upperBound] (sumMultiplesOverRange currentNum upperBound 00)) 
  ([currentNum upperBound sum] (do
    (if (< currentNum upperBound)
      (if (or (isMultiple currentNum 3) (isMultiple currentNum 5))
        (recur (inc currentNum) upperBound (+ sum currentNum))
        (recur (inc currentNum) upperBound sum))
      sum))))

(defn -main
  "Project Euler Problem #1"
  [& args]
  (println (sumMultiplesOverRange 1 1000)))
