
(println (assoc {} :key1 "value" :key2 "another value"))

(println (assoc {:key1 "old value1" :key2 "value2"} :key1 "value1" :key3 "value3"))

(println (assoc nil :key1 4))

(println (assoc [1 2 3] 0 10))

(println (assoc [1 2 3] 3 10))

;(println (assoc [1 2 3] 4 10))

(def test-map {:account-no 12345678 :lname "Jones" :fname "Fred"})

(println (assoc test-map :fname "Sue"))

(println test-map)