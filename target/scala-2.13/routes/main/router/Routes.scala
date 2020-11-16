// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielchavez/Developer/Scala/cherry/cherry/conf/routes
// @DATE:Sun Nov 15 19:58:23 EST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_3: controllers.HomeController,
  // @LINE:12
  CountController_2: controllers.CountController,
  // @LINE:14
  AsyncController_0: controllers.AsyncController,
  // @LINE:17
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_3: controllers.HomeController,
    // @LINE:12
    CountController_2: controllers.CountController,
    // @LINE:14
    AsyncController_0: controllers.AsyncController,
    // @LINE:17
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getdeal""", """controllers.HomeController.getDeal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getdeals""", """controllers.HomeController.getDeals"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletedeal""", """controllers.HomeController.deleteDeal"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatedeal""", """controllers.HomeController.updateDeal"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createdeal""", """controllers.HomeController.createDeal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_getDeal1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getdeal")))
  )
  private[this] lazy val controllers_HomeController_getDeal1_invoker = createInvoker(
    HomeController_3.getDeal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getDeal",
      Nil,
      "GET",
      this.prefix + """getdeal""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_getDeals2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getdeals")))
  )
  private[this] lazy val controllers_HomeController_getDeals2_invoker = createInvoker(
    HomeController_3.getDeals,
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

  // @LINE:8
  private[this] lazy val controllers_HomeController_deleteDeal3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletedeal")))
  )
  private[this] lazy val controllers_HomeController_deleteDeal3_invoker = createInvoker(
    HomeController_3.deleteDeal,
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
    HomeController_3.updateDeal,
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
    HomeController_3.createDeal,
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

  // @LINE:12
  private[this] lazy val controllers_CountController_count6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count6_invoker = createInvoker(
    CountController_2.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AsyncController_message7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message7_invoker = createInvoker(
    AsyncController_0.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String]),
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
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:6
    case controllers_HomeController_getDeal1_route(params@_) =>
      call { 
        controllers_HomeController_getDeal1_invoker.call(HomeController_3.getDeal)
      }
  
    // @LINE:7
    case controllers_HomeController_getDeals2_route(params@_) =>
      call { 
        controllers_HomeController_getDeals2_invoker.call(HomeController_3.getDeals)
      }
  
    // @LINE:8
    case controllers_HomeController_deleteDeal3_route(params@_) =>
      call { 
        controllers_HomeController_deleteDeal3_invoker.call(HomeController_3.deleteDeal)
      }
  
    // @LINE:9
    case controllers_HomeController_updateDeal4_route(params@_) =>
      call { 
        controllers_HomeController_updateDeal4_invoker.call(HomeController_3.updateDeal)
      }
  
    // @LINE:10
    case controllers_HomeController_createDeal5_route(params@_) =>
      call { 
        controllers_HomeController_createDeal5_invoker.call(HomeController_3.createDeal)
      }
  
    // @LINE:12
    case controllers_CountController_count6_route(params@_) =>
      call { 
        controllers_CountController_count6_invoker.call(CountController_2.count)
      }
  
    // @LINE:14
    case controllers_AsyncController_message7_route(params@_) =>
      call { 
        controllers_AsyncController_message7_invoker.call(AsyncController_0.message)
      }
  
    // @LINE:17
    case controllers_Assets_versioned8_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(file))
      }
  }
}
