package controllers

import javax.inject._

import play.api.mvc._

import scala.collection.immutable.IndexedSeq
import scala.collection.mutable.ArrayBuffer

import org.mongodb.scala._
import org.mongodb.scala.model.Aggregates._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Projections._
import org.mongodb.scala.model.Sorts._
import org.mongodb.scala.model.Updates._
import org.mongodb.scala.model._
import play.api.libs.json._
import controllers.Helpers._


@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  def getDeals = Action {
    val uri: String = "mongodb+srv://dchavez:daniel97@cluster0.2sezf.mongodb.net/"
    val client: MongoClient = MongoClient(uri)
    val db: MongoDatabase = client.getDatabase("happy_hour")
    val collection: MongoCollection[Document] = db.getCollection("deals")
    var result = collection.find().results()
    var docs = ArrayBuffer[String]()
    for (e <- result) docs += e.toJson 
    val res =  "{\"results\":[" + docs.mkString(", ") + "]}"
    Ok(res)
  }


  def getDealTest = Action {implicit request =>
    val dealId = request.getQueryString("id").getOrElse(null)
    //learn how to handle an error in the request
      dealService.getDealDetails(dealId)
      .map(dealDetails => Json.toJson(dealDetails))
      .map(Ok(_))
  }


  def getDeal = Action {implicit request =>
    val requestID = request.getQueryString("id").getOrElse("None")
    val uri: String = "mongodb+srv://dchavez:daniel97@cluster0.2sezf.mongodb.net/"
    val client: MongoClient = MongoClient(uri)
    val db: MongoDatabase = client.getDatabase("happy_hour")
    val collection: MongoCollection[Document] = db.getCollection("deals")
    val query = requestID
    val result = collection.find(equal("_id", query)).first().results()
    var docs = ""
    for (e <- result) docs += e.toJson
    Ok(docs)
  }

  def createDeal = Action { request =>
    val uri: String = "mongodb+srv://dchavez:daniel97@cluster0.2sezf.mongodb.net/"
    val client: MongoClient = MongoClient(uri)
    val db: MongoDatabase = client.getDatabase("happy_hour")
    val collection: MongoCollection[Document] = db.getCollection("deals")
    val json = request.body.asJson.get
    val dealLoc = json \ "dealLoc"
    val dealPrice = json \ "dealPrice"
    val dealItems0 = json \ "dealItems"
    val dealItems = dealItems0.as[Map[String, Boolean]]
    val dealDays0 = json \ "dealDays"
    val dealDays = dealDays0.as[Map[String, Boolean]]
    val doc: Document = Document("dealLoc" -> dealLoc.as[String],
                                 "dealPrice" -> dealPrice.as[Double],
                                 "dealItems" -> Document("beer" -> dealItems.get("beer"), "shot" -> dealItems.get("shot"), "cocktail" -> dealItems.get("cocktail")),
                                 "dealDays" -> Document("M" -> dealDays.get("M"), "T" -> dealDays.get("T"), "W" -> dealDays.get("W"), "R" -> dealDays.get("R"), "F" -> dealDays.get("F"), "Sa" -> dealDays.get("Sa"), "Su" -> dealDays.get("Su")))
    collection.insertOne(doc).results()
    Ok("inserted")
  }

  def deleteDeal = Action {Ok("hello")}

  def updateDeal = Action {Ok("hello")}

}
