package controllers

import javax.inject._

import play.api.mvc._

import scala.collection.immutable.IndexedSeq

import org.mongodb.scala._
import org.mongodb.scala.model.Aggregates._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Projections._
import org.mongodb.scala.model.Sorts._
import org.mongodb.scala.model.Updates._
import org.mongodb.scala.model._
import play.api.libs.json._
import controllers.Helpers._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def mongo = Action {
    val uri: String = "mongodb+srv://dchavez:daniel97@cluster0.2sezf.mongodb.net/"
    val client: MongoClient = MongoClient(uri)
    val db: MongoDatabase = client.getDatabase("sample_analytics")
    val collection: MongoCollection[Document] = db.getCollection("customers")
    val result = collection.find().results()
    var docs = ""
    for (e <- result) docs += e.toJson
    val res = "{results: [" + docs + "]}"
    Ok(res)
  }

}
