// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ec2-user/cherry-scala/conf/routes
// @DATE:Fri Mar 12 20:48:33 UTC 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers.javascript {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getDeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getDeal",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getdeal" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:8
    def deleteDeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteDeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletedeal"})
        }
      """
    )
  
    // @LINE:6
    def getDeals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getDeals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getdeals"})
        }
      """
    )
  
    // @LINE:7
    def getCurrentDeals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCurrentDeals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getcurrentdeals"})
        }
      """
    )
  
    // @LINE:10
    def createDeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createDeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createdeal"})
        }
      """
    )
  
    // @LINE:9
    def updateDeal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateDeal",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatedeal"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }


}
