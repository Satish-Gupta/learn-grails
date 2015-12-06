package com.skg.defaultaction

class ObviousDefaultActionController {

    def displayMessage() {
        render "Its obvious that I (i.e $actionName) is the default action since I am the only method that exist here"
    }
}
