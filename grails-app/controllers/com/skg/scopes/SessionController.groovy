package com.skg.scopes

class SessionController {

    static String viewLocation = "/scopes/session/"
    def index() {
        log.info '#index inside index'
        render view: viewLocation + "index.gsp"
    }

    def sayHello() {
        log.info '#sayHello'
        session["message"] = "This text is retrieved from session"
        log.debug "#sayHello request.getSession().message :${request.getSession().message}"
//        session.maxInactiveInterval = 5
//        session.setMaxInactiveInterval(5)       // parameter is in seconds

        render view: viewLocation + "say-hello.gsp", model:[sourceAction: "sayHello"]
//        forward action: "helloAgain"
//        redirect action: 'helloAgain', model:[sourceAction: 'sayHello']
    }

    def helloAgain() {
        log.info '#helloAgain'
        render view: viewLocation + "hello-again.gsp", model:[sourceAction: "helloAgain"]
    }

    def goodNight() {
        log.info '#goodNight'
//        session.removeAttribute('message')
//        session.message = null
        log.info "#goodNight session['message'] =${session.message}"
//        session.invalidate()
//        log.info "#goodNight session['message'] =${session?.message}"
        render view: viewLocation + "good-night.gsp", model:[sourceAction: "goodNight"]
    }

    def bye() {
        log.info '#bye'
        render view: viewLocation + "bye.gsp", model:[sourceAction: "bye"]
    }

    def putEmployeeInSession() {
        List employees = Employee.findAll()
        session.employee = employees[0]
        def employee = session.employee
        log.info "#putEmployeeInSession employee: ${employee.name}"
        log.info "#putEmployeeInSession dep: $employee.department.name"
        render view: viewLocation + "index.gsp"
    }

    def getEmployeeFromSession() {
        def employee = session.employee

        // Re-attach object to session, but don't sync the data with the database.
        //        employee.attach()

// Re-attach object, but merge any changes with the data in the database.
// You *must* use the instance returned by the merge() method.
//        employee = employee.merge()

        log.info "#getDepartmentFromSession isEmployeeAttached: ${employee.isAttached()} employee: $employee.name dep: ${employee.department.name}"

        render "hello"
//        render view: '/employee/index.gsp', model: [employeeInstanceList]
    }


}
