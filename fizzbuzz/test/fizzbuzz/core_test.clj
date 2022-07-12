(ns fizzbuzz.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [fizzbuzz.core :refer [fizzbuzz]]))

(deftest fizz
  (testing "Fizz"
    (is (= "Fizz" (nth fizzbuzz 3)))
    (is (= "Fizz" (nth fizzbuzz 6)))
    (is (every? #(or (= "Fizz" %) (= "FizzBuzz" %)) (take 100 (take-nth 3 fizzbuzz))))))

(deftest buzz
  (testing "Buzz"
    (is (= "Buzz" (nth fizzbuzz 5)))
    (is (= "Buzz" (nth fizzbuzz 10)))
    (is (every? #(or (= "Buzz" %) (= "FizzBuzz" %)) (take 100 (take-nth 5 fizzbuzz))))))

(deftest wholefizzbuzz
  (testing "FizzBuzz"
    (is (= "FizzBuzz" (nth fizzbuzz 15)))
    (is (= "FizzBuzz" (nth fizzbuzz 30)))
    (is (every? #(= "FizzBuzz" %) (take 100 (take-nth 15 fizzbuzz))))))