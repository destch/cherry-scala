package deals.repositories

class DealRepo {
	def findById(userId: Long): Maybe[Deal] = {
	   	deals
	   	  .find(equal("_id", dealID))
	   	  .first()
	   	  .results()
	  }
}