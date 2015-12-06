package com.skg.defaultaction

class ExplicitDefaultActionController {

    static defaultAction = "hello"

    def index() {
        render "I came from $actionName action"
    }

    def hello() {
        render "Hello!!! I came from explicitly defined default action (namely $actionName)"
    }
}
