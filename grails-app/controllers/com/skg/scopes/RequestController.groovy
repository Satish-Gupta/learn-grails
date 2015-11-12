package com.skg.scopes

class RequestController {

    def index() {
        render view: "/scopes/request.gsp", model:[title:"Request Scope"]
    }

    def request(){
        render view: "/scopes/welcome.gsp", model:[message:"Welcome!!!"]
    }

    def nextRequest() {
        render view: "/scopes/welcome.gsp"
    }

    def forwardRequest() {
        params.message = "Hello!!!"
        forward action: "sayHello"
    }

    def sayHello() {
        render view: "/scopes/say-hello.gsp", model:[title:"Request Scope",message:params.message]
    }
}
