
(println (when (= 1 1) true))

(println (when (not= 1 1) true))

(def has-value (when true (println "Hello World") "Returned Value"))

(println has-value)