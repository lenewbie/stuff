package castspel.scala_exercises_47deg

/**
 * http://scala-exercises.47deg.com/koans#constructors
 */
object ConstructorsNeedProperOrder extends App {
    println("ala")
}


class Employee(val firstName:String, val lastName:String){
  var age:Int = 0
  var city:String = _

//  def this(firstName:String, lastName: String, city:String, age:Int){
//    this(firstName, lastName, city)
//    this.age = age
//
//  }

  def this(firstName:String, lastName: String, city:String){
    this(firstName,lastName)
    this.city = city

  }

  override def toString():String = {
    "First Name: "+firstName+" Last Name: "+lastName
  }

}
