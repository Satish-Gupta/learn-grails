package com.skg.scopes

class FlashController {

    static String viewLocation = "/scopes/flash/"
    def index() {
        render view: viewLocation + "index.gsp"
    }

    def sayHello() {
        flash.message = "Hello!!!"
        render view: viewLocation + "say-hello.gsp", model:[sourceAction: "sayHello"]
//        redirect action: 'helloAgain', model:[sourceAction: 'sayHello']
    }

    def helloAgain() {
        render view: viewLocation + "hello-again.gsp", model:[sourceAction: "helloAgain"]
    }

    def goodNight() {
        render view: viewLocation + "good-night.gsp", model:[sourceAction: "goodNight"]
    }
    def bye() {
        render view: viewLocation + "bye.gsp", model:[sourceAction: "bye"]
    }


}
