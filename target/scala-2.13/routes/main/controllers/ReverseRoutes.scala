// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielchavez/Developer/Scala/cherry/cherry/conf/routes
// @DATE:Sat Jan 30 21:16:56 EST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:13
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def deleteDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deletedeal")
    }
  
    // @LINE:6
    def getDeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeals")
    }
  
    // @LINE:5
    def getDeal(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeal")
    }
  
    // @LINE:9
    def createDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createdeal")
    }
  
    // @LINE:8
    def updateDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatedeal")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
