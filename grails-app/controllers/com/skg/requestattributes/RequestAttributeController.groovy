package com.skg.requestattributes

class RequestAttributeController {

    def index() {
    }
    def displayRequestAttributes() {
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
                        params: $params  params type: is params map:${params instanceof Map}
                        actionUri: $actionUri
                        controllerUri:$controllerUri
                        flash: $flash
                        log: $log
                        request: $request
                        response: $response
                        session:$session
                        servletContext: $servletContext</pre>"""
    }

    def oldVsNew() {
        request.setAttribute("myRequestAttr", "myRequestValue1111");
        request.yourRequestAttr = "yourRequestValue2222"

        log.info 'request.getAttribute("myRequestAttr")  = ' + request.getAttribute("myRequestAttr");
        log.info 'request.yourRequestAttr = ' + request.yourRequestAttr

        session.setAttribute("mySessionAttr", "mySessionValue3333");
        session.yourSessionAttr = "yourSessionValue4444"

        log.info 'session.getAttribute("mySessionAttr") = ' + session.getAttribute("mySessionAttr");
        log.info 'session.yourSessionAttr = ' + session.yourSessionAttr

        servletContext.setAttribute("myServletContextAttr", "myServletContextValue5555");
        servletContext.yourServletContextAttr = "yourServletContextValue6666"

        log.info 'servletContext.getAttribute("myServletContextAttr"); = ' + servletContext.getAttribute("myServletContextAttr");
        log.info 'servletContext.yourServletContextAttr = ' + servletContext.yourServletContextAttr

        String string = """<pre>
            <code>request.setAttribute("myRequestAttr", "myRequestValue1111");</code>
            request.yourRequestAttr = "yourRequestValue2222"

        request.getAttribute("myRequestAttr")  Output==>  ${request.getAttribute("myRequestAttr");}
        request.yourRequestAttr Output==> $request.yourRequestAttr

        session.setAttribute("mySessionAttr", "mySessionValue3333");
        session.yourSessionAttr = "yourSessionValue4444"

        session.getAttribute("mySessionAttr") Output==> ${session.getAttribute("mySessionAttr");}
        session.yourSessionAttr Output==> $session.yourSessionAttr

        servletContext.setAttribute("myServletContextAttr", "myServletContextValue5555");
        servletContext.yourServleContextAttr == "yourServletContextValue6666"

        servletContext.getAttribute("myServletContextAttr"); Output==> ${servletContext.getAttribute("myServletContextAttr");}
        servletContext.yourServletContextAttr Output==> $servletContext.yourServletContextAttr
</pre>
        """

        render string
    }
}
