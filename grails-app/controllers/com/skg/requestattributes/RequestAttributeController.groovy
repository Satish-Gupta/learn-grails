package com.skg.requestattributes

class RequestAttributeController {

    def index() {
        String requestAttributes = """      actionName: $actionName
                        params: $params
                        actionUri: $actionUri
                        controllerUri:$controllerUri
                        flash: $flash
                        log: $log
                        request: $request
                        response: $response
                        session:$session
                        servletContext: $servletContext"""
        log.info requestAttributes

        render """<pre>\t\t\tactionName: $actionName
                        params: $params
                        actionUri: $actionUri
                        controllerUri:$controllerUri
                        flash: $flash
                        log: $log
                        request: $request
                        response: $response
                        session:$session
                        servletContext: $servletContext</pre>"""
    }
}
