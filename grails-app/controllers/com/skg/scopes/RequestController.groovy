package com.skg.scopes

class RequestController {

    def viewLocation = "/scopes/request/"
    def index() {
        render view: viewLocation + "request.gsp", model:[title:"Request Scope"]
    }

    def request(){
        render view: viewLocation + "hello-again.gsp", model:[message:"Welcome!!!"]
    }

    def nextRequest() {
        render view: viewLocation + "hello-again.gsp"
    }

    def forwardRequest() {
        params.message = "Hello!!!"
        forward action: "sayHello"
    }

    def sayHello() {
        render view: viewLocation + "say-hello.gsp", model:[title:"Request Scope",message:params.message]
    }
}
