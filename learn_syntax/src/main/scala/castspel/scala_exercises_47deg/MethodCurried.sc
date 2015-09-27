def add2(a1: Int, a2: Int): String = s"$a1 $a2"
add2(1,2)

def foo = (add2 _).curried
foo(2)(3)

def add3(a1: Int, a2: Int, a3: Int): String = s"$a1 $a2 $a3"
add3(1,2,3)

def bar = (add3 _).curried
bar(1)(2)(3)









