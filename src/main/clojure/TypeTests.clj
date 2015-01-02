
(println (type 10))

(println (type 10.0))

(println (type [10 20]))

(println (type '(10 20)))

(println (type :a))

(println (type Thread))

(println (type 'whatever))

(println (type clojure.lang.Symbol))

(defn foo [] ("any string"))

(println (type foo))

;(println (type fn))

;(println (type clojure.core/fn))

(defn purchase-order [id date amount]
  ^{:type ::PurchaseOrder}
  {:id id :date date :amount amount})

(def my-order (purchase-order 10 (java.util.Date.) 100.0))

(println my-order)

(println (type my-order))

(println (type {}))