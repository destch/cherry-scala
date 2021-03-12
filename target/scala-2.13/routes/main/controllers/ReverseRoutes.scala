// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielchavez/Developer/Scala/cherry/cherry/conf/routes
// @DATE:Thu Mar 11 17:35:15 EST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def getDeal(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeal" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:8
    def deleteDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deletedeal")
    }
  
    // @LINE:6
    def getDeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getdeals")
    }
  
    // @LINE:7
    def getCurrentDeals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getcurrentdeals")
    }
  
    // @LINE:10
    def createDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createdeal")
    }
  
    // @LINE:9
    def updateDeal(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatedeal")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
