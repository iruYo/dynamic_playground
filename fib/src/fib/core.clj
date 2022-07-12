(ns fib.core)

(def fib
  (map first (iterate (fn [[A B]] [B (+ A B)]) [0 1])))

(defn recursive-fib [n]
  (condp = n
    0 0
    1 1
    (+ (recursive-fib (- n 2)) (recursive-fib (- n 1)))))

(def recursive-fib-mem
  (memoize (fn [n] (condp = n
                     0 0
                     1 1
                     (+ (recursive-fib (- n 2)) (recursive-fib (- n 1)))))))

(defn recursive-fib-memo
  ([n]
   (recursive-fib-memo n {0 0, 1 1}))
  ([n memo]
   (cond
     (contains? memo n) memo
     :else (assoc memo n (+ (last (val (recursive-fib-memo (- n 2) memo))) (last (val (recursive-fib-memo (- n 1) memo))))))))