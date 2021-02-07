package deals.services

import deals.models._
import deals.repositories.UserRepo

private[deals] class DealService(dealRepo: DealRepo,
                                 implicit private val ec: ExecutionContext) {

  def getDealDetails(dealId: Long): Maybe[DealDetails] = {
    require(dealId != null)

    dealRepo.findById(dealId)
      .map(DealDetails(_))
  }
}