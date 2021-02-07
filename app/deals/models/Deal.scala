package deals.models

case class Deal(id: DealId,
                username: Username,
                email: Email,
                bio: Option[String],
                image: Option[String],
                createdAt: Instant,
                updatedAt: Instant)
