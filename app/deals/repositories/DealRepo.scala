package deals.repositories

import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import controllers.Helpers._
import org.mongodb.scala.bson.ObjectId
import deals.models.Deal
import org.mongodb.scala.bson.codecs.Macros._
import org.mongodb.scala.MongoClient.DEFAULT_CODEC_REGISTRY
import org.bson.codecs.configuration.CodecRegistries.{fromRegistries, fromProviders}
import java.util.Calendar
import java.text.SimpleDateFormat




trait repository {
	def Get(id: String): Seq[Any]
}

class DealRepo {

	import DealsCollection.deals

	def Get(dealId: String): Seq[Deal] = {
	   	deals
	   	  .find(equal("_id", new ObjectId(dealId)))
	   	  .first()
	   	  .results()
	  }

	def List(): Seq[Deal] = {
	   	deals
	   	  .find()
	   	  .results()
	  }

	def ListFilter(): Seq[Deal] = {
		val now = Calendar.getInstance.getTime
		val dowInt = new SimpleDateFormat("u")
		val dayNum = dowInt.format(now)
		val time = Calendar.getInstance()
		val curTime = time.get(Calendar.HOUR_OF_DAY) + 1
		deals
	   	  .find(and(lte("dealStart." + dayNum, curTime), gte("dealEnd." + dayNum, curTime)))
	   	  .results()
	}
}

object DealsCollection {
	val uri: String = "mongodb+srv://dchavez:daniel97@cluster0.2sezf.mongodb.net/"
    val client: MongoClient = MongoClient(uri)
    val codecRegistry = fromRegistries( fromProviders(classOf[Deal]), DEFAULT_CODEC_REGISTRY )
    val db: MongoDatabase = client.getDatabase("happy_hour").withCodecRegistry(codecRegistry)
    val deals: MongoCollection[Deal] = db.getCollection("deals")
}