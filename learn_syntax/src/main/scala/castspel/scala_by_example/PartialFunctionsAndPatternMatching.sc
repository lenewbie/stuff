val f: String => String = {case "foo" => "bar"}
f("foo")

val fp: PartialFunction[String, String] = {case "foo" => "baz"}

fp.isDefinedAt("foo")
f("foo")
fp.isDefinedAt("stuff")
fp("stuff")  //scala.MatchError: stuff (of class java.lang.String)