
(println (array-map [1 2] [3 4 5]))

(println (array-map [1 2] [3 4 5] [3 4 5] [3 4 5]))

(println (array-map :a 10))

(println (array-map :a 10 :b 20))

(println (apply array-map [:a 10 :b 20 :c 30]))

(println (apply assoc {} [:a 10 :b 20 :c 30]))

(println (keys (assoc (array-map :foo 10 :bar 20) :baz 30)))