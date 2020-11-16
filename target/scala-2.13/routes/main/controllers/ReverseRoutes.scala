// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielchavez/Developer/Scala/cherry/cherry/conf/routes
// @DATE:Sun Nov 15 19:58:23 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:14
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def deleteDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deletedeal")
    }
  
    // @LINE:7
    def getDeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeals")
    }
  
    // @LINE:6
    def getDeal(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeal")
    }
  
    // @LINE:10
    def createDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createdeal")
    }
  
    // @LINE:9
    def updateDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatedeal")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
