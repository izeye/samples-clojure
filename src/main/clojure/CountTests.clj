
(println (count nil))

(println (count []))

(println (count [1 2 3]))

(println (count {:one 1 :two 2}))

(println (count [1 \a "string" [1 2] {:foo :bar}]))

(println (count "string"))

(println (= (count '(1 2 3 3 1)) 5))