package deals.models

private[deals] case class DealDetails(email: Email, username: Username, bio: Option[String], image: Option[String],
                       createdAt: Instant, updatedAt: Instant)

private[deals] object DealDetails {

  def apply(deal: Deal): DealDetails = DealDetails(user.email, user.username, user.bio, user.image, user.createdAt,
    user.updatedAt)

  implicit val dealDetailsFormat: Format[DealDetails] = Json.format[DealDetails]
}
