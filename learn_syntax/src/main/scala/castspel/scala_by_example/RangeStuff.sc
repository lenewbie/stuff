// Ranges they contain first, last and step
val x1:Range = 1 to 10

// exclude last
val x2: Range = 1 until 10

// 1, 3, 5, 7, 9
1 to 10 by 2

// 9, 6, 3
9 to 3 by -3

// Array is a Seq
val a1: Seq[String] = Array("foo", "bar", "baz", "quux")
a1 exists (_.length > 3) // true cause "quux".length = 4

// Range is a Seq
val a2: Seq[Int] = 3 to 33 by 3
a2 forall (_ % 3 == 0)

// String is a Seq
val s2 = Vector(1, 2, 3, 4)
val s1 = "John Doe"

val zipped = s1 zip s2
zipped.head
zipped.last

val(z1, z2) = zipped unzip

z1 equals s1 // false because z1 have lower number of elements
z2 equals s2








