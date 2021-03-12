// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielchavez/Developer/Scala/cherry/cherry/conf/routes
// @DATE:Thu Mar 11 17:35:15 EST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_1: controllers.HomeController,
  // @LINE:13
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_1: controllers.HomeController,
    // @LINE:13
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getdeal""", """controllers.HomeController.getDeal(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getdeals""", """controllers.HomeController.getDeals"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getcurrentdeals""", """controllers.HomeController.getCurrentDeals"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletedeal""", """controllers.HomeController.deleteDeal"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatedeal""", """controllers.HomeController.updateDeal"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createdeal""", """controllers.HomeController.createDeal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_getDeal0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getdeal")))
  )
  private[this] lazy val controllers_HomeController_getDeal0_invoker = createInvoker(
    HomeController_1.getDeal(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getDeal",
      Seq(classOf[String]),
      "GET",
      this.prefix + """getdeal""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_getDeals1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getdeals")))
  )
  private[this] lazy val controllers_HomeController_getDeals1_invoker = createInvoker(
    HomeController_1.getDeals,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getDeals",
      Nil,
      "GET",
      this.prefix + """getdeals""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_getCurrentDeals2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getcurrentdeals")))
  )
  private[this] lazy val controllers_HomeController_getCurrentDeals2_invoker = createInvoker(
    HomeController_1.getCurrentDeals,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCurrentDeals",
      Nil,
      "GET",
      this.prefix + """getcurrentdeals""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_deleteDeal3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletedeal")))
  )
  private[this] lazy val controllers_HomeController_deleteDeal3_invoker = createInvoker(
    HomeController_1.deleteDeal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteDeal",
      Nil,
      "POST",
      this.prefix + """deletedeal""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_updateDeal4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatedeal")))
  )
  private[this] lazy val controllers_HomeController_updateDeal4_invoker = createInvoker(
    HomeController_1.updateDeal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDeal",
      Nil,
      "POST",
      this.prefix + """updatedeal""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_createDeal5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createdeal")))
  )
  private[this] lazy val controllers_HomeController_createDeal5_invoker = createInvoker(
    HomeController_1.createDeal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createDeal",
      Nil,
      "POST",
      this.prefix + """createdeal""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_getDeal0_route(params@_) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_HomeController_getDeal0_invoker.call(HomeController_1.getDeal(id))
      }
  
    // @LINE:6
    case controllers_HomeController_getDeals1_route(params@_) =>
      call { 
        controllers_HomeController_getDeals1_invoker.call(HomeController_1.getDeals)
      }
  
    // @LINE:7
    case controllers_HomeController_getCurrentDeals2_route(params@_) =>
      call { 
        controllers_HomeController_getCurrentDeals2_invoker.call(HomeController_1.getCurrentDeals)
      }
  
    // @LINE:8
    case controllers_HomeController_deleteDeal3_route(params@_) =>
      call { 
        controllers_HomeController_deleteDeal3_invoker.call(HomeController_1.deleteDeal)
      }
  
    // @LINE:9
    case controllers_HomeController_updateDeal4_route(params@_) =>
      call { 
        controllers_HomeController_updateDeal4_invoker.call(HomeController_1.updateDeal)
      }
  
    // @LINE:10
    case controllers_HomeController_createDeal5_route(params@_) =>
      call { 
        controllers_HomeController_createDeal5_invoker.call(HomeController_1.createDeal)
      }
  
    // @LINE:13
    case controllers_Assets_versioned6_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(file))
      }
  }
}
