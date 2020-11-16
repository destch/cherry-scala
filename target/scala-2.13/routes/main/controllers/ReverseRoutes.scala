// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielchavez/Developer/Scala/cherry/cherry/conf/routes
// @DATE:Sun Nov 15 19:07:45 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:15
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def deleteDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deletedeal")
    }
  
    // @LINE:8
    def getDeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeals")
    }
  
    // @LINE:7
    def getDeal(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeal")
    }
  
    // @LINE:6
    def mongo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "mongo")
    }
  
    // @LINE:11
    def createDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createdeal")
    }
  
    // @LINE:10
    def updateDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatedeal")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
