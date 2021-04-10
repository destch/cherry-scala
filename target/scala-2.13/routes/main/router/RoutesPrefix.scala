// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ec2-user/cherry-scala/conf/routes
// @DATE:Fri Mar 12 20:48:33 UTC 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
