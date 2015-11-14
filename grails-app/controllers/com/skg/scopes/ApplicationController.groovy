package com.skg.scopes

class ApplicationController {

    def index() {
        render view: '/application/index.gsp'
    }

    def setMessageInServletContext() {
        servletContext.setAttribute("count",0)
        servletContext.message =  "This message came from application scope"

        log.info "#setMessageInServletContext servletContext.message: $servletContext.message count: $servletContext.count"
        render servletContext.getAttribute("message") + " count:" + servletContext.count
    }

    def getMessageInApplicationScope() {
        servletContext.count += 1
        log.info "#getMessageInApplicationScope servletContext.message: $servletContext.message count : $servletContext.count"
        render servletContext.message + " count:" + servletContext.count
    }

    def removeMessageInApplicationScope() {
        servletContext.removeAttribute("message")
        log.info "#removeMessageInApplicationScope servletContext.message: $servletContext.message count : $servletContext.count"

        render view: '/application/index.gsp'
    }
}
