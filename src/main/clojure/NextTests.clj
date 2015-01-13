
(println (next '(:alpha :bravo :charlie)))

(println (next (next '(:one :two :three))))

(println (next (next (next '(:one :two :three)))))

(defn my-map [func a-list]
  (when a-list
    (cons (func (first a-list))
      (my-map func (next a-list)))))

(my-map println [1 2 3])