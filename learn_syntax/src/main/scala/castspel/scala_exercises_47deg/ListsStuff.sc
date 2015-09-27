val numbers = List(1,2,3)

numbers.head

numbers.tail

val langs = List("Erlang", "Scala", "Clojure", "Haskell", "APL")

langs map {  _.toLowerCase() }
langs map { _.length }
langs filter { _.length < 6}
langs filter ( _.length < 6 )