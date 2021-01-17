package aaexample

import play.api.libs.json.{
  JsArray,
  JsBoolean,
  JsFalse,
  JsNull,
  JsNumber,
  JsObject,
  JsString,
  JsTrue,
  JsValue
}

object JsDemo {

  def transform(json: JsValue): JsValue =
    json match {
      case JsNull        => JsString("I am null")
      case JsTrue        => JsFalse
      case JsFalse       => JsTrue
      case JsNumber(num) => JsNumber(num * num)
      case JsString(str) => JsString(str.stripPrefix("urn:"))
      case JsArray(seq)  => JsArray(seq.map(transform))
      case JsObject(map) => JsObject(map.map { case (k, v) => k -> transform(v) })
    }

}
