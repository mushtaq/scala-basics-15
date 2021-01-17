
import aaexample.JsDemo
import play.api.libs.json._

val json: JsValue = Json.obj(
  "a" -> 10,
  "b" -> true,
  "d" -> "urn:world",
  "d1" -> "world",
  "c" -> JsNull,
  "e" -> Json.obj(
    "f" -> 20,
    "g" -> false,
    "h" -> "hello",
    "i" -> Json.arr("urn:pune", "this", "is", ""),
    "i2" -> Json.arr(9, 7)
  ),
  "j" -> Json.arr(
    Json.obj("k" -> "urn:tw", "l" -> "munich"),
    Json.obj("k" -> "autoscout", "l" -> "urn:germany")
  ),
  "m" -> 90,
  "n" -> "urn:ignore"
)

// urn:blah => hello blah

val result = JsDemo.transform(json)
Json.prettyPrint(result)
