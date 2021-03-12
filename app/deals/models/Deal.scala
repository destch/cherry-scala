package deals.models

import play.api.libs.json.{Format, Json}
import org.mongodb.scala._
import org.mongodb.scala.bson.codecs.Macros._
import org.mongodb.scala.MongoClient.DEFAULT_CODEC_REGISTRY
import org.bson.codecs.configuration.CodecRegistries.{fromRegistries, fromProviders}
import org.mongodb.scala.bson.ObjectId
import play.api.libs.json._

case class Deal(_id: ObjectId, dealLoc: Option[String],dealAddr: Option[String], dealLocOpen: Option[Map[String, Double]], dealLocClose: Option[Map[String, Double]],
 dealItems: Option[Map[String, Double]], dealDesc: Option[String], dealPrice: Option[Double],
 dealRatings: Option[Double], dealRating: Option[String], dealComments: Option[String],
dealVerif: Option[Double], dealDays: Option[Map[String, Double]], dealStart: Option[Map[String, Double]], dealEnd: Option[Map[String, Double]], dealThumb: Option[String])

object Deal {


  implicit val objectIdFormat: Format[ObjectId] = Format(
    Reads[ObjectId] {
      case s: JsString => if (org.bson.types.ObjectId.isValid(s.toString)) JsSuccess(new ObjectId(s.toString)) else JsError()
      case _           => JsError()
    },
    Writes[ObjectId]((o: ObjectId) => JsString(o.toHexString))
  )
  implicit val dealFormat: Format[Deal] = Json.format[Deal]
  
}

