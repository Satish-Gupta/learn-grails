package com.skg.scopes

class FlashController {

    static String viewLocation = "/scopes/flash/"
    def index() {
        log.info '#index inside index'
        render view: viewLocation + "index.gsp"
    }

    def sayHello() {
        log.info '#sayHello'
        flash.message = "Hello!!!"
        render view: viewLocation + "say-hello.gsp", model:[sourceAction: "sayHello", message:'heloooooo']
//        forward action: "helloAgain"
//        redirect action: 'helloAgain', model:[sourceAction: 'sayHello']
    }

    def helloAgain() {
        log.info '#helloAgain'
        render view: viewLocation + "hello-again.gsp", model:[sourceAction: "helloAgain", message: 'hello again']
    }

    def goodNight() {
        log.info '#goodNight'
        render view: viewLocation + "good-night.gsp", model:[sourceAction: "goodNight", message: 'good night']
    }

    def bye() {
        log.info '#bye'
        render view: viewLocation + "bye.gsp", model:[sourceAction: "bye", message: 'bye']
    }


}
