(ns fizzbuzz.core)

(def fizzbuzz
  (map (fn [n]
         (cond
           (and (= 0 (rem n 3)) (= 0 (rem n 5))) "FizzBuzz"
           (= 0 (rem n 3)) "Fizz"
           (= 0 (rem n 5)) "Buzz"
           :else n))
       (iterate inc 0)))
