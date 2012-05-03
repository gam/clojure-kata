(ns roman-numerals.kata)

(def ^:dynamic *translations*
  [[100 ["C" "D" "M"]]
   [10  ["X" "L" "C"]]
   [1   ["I" "V" "X"]]])

(defn translate [num [base [one five ten]]]
  (loop [acc [] rem num]
    (if (< rem base) [acc rem]
        (let [base-times (partial * base)
              add (partial conj acc)]
          (cond       
           (=  rem (base-times 9)) (recur (add one ten)  (- rem (base-times 9)))
           (>= rem (base-times 5)) (recur (add five)     (- rem (base-times 5)))
           (=  rem (base-times 4)) (recur (add one five) (- rem (base-times 4)))
           (>= rem base)           (recur (add one)      (- rem base)))))))

(defn to-roman [number]
  (loop [acc [] rem number translations *translations*]
    (if (empty? translations)    (apply str (flatten acc))
        (let [[acc1 rem1] (translate rem (first translations))]
          (recur (conj acc acc1) rem1 (rest translations))))))
