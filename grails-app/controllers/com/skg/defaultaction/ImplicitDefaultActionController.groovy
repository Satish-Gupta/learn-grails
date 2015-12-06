package com.skg.defaultaction

class ImplicitDefaultActionController {


    def index() {
        render "Hi!!! I am from Implicitly defined action. i.e always $actionName"
    }

    def hi() {
        render 'Hi!!!'
    }
}
