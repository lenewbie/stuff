package castspel.patterns.monads.coursea_reactive

/**
 * Created by lemastero on 9/20/15.
 */
trait Monad[T] {

  /* bind */
  def flatMap[U](f: T => Monad[U]):Monad[U]

  def unit[T](x: T): Monad[T]



/* examples of monads
- List
unit(x) = List(x)
flatMap is flatMap

- Set
unit is Set(x) and flatMap is flatMap

- Option
unit(x) = Some(x)
*/

/*
monads can have easily defined map by unit and flatMap
m map f = m flatMap(x => unit(f(x))
or
m map f = m flatMap (f andThen unit)
*/

/* Moand Laws (restrictions for methods unit, flatMap
* Associativity
  (m flatMap f) flatMap f) == m flatMap (x => f(x) flatMap g)
* Left unit
  unit(x) flatMap  f = f(x)
* Right unit
  m flatMap unit == m
 */
