package deals.services

import javax.inject._
import deals.models._
import deals.repositories.DealRepo
import scala.concurrent.ExecutionContext
import org.mongodb.scala._

class DealService @Inject() (dealRepo: DealRepo) {
  def getDealDetails(dealId: String): Seq[Deal] = {
    dealRepo.Get(dealId)
  }

  def getDeals(): Seq[Deal] = {
    dealRepo.List()
  }

  def getCurrentDeals(): Seq[Deal] = {
    dealRepo.ListFilter()
  }
}

