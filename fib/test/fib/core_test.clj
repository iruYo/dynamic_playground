(ns fib.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [fib.core :refer [fib recursive-fib]]))

(def fibs '(0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229))

(deftest fibonacci
  (testing "recursive fibs"
    (is (= fibs (take 30 (map recursive-fib (iterate inc 0))))))
  (testing "lazy seq fibs"
    (is (= fibs (take 30 fib)))))
