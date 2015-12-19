package com.skg.learngrails.ControllerResult

import grails.converters.JSON
import grails.converters.XML

class EmployeeController {

    def index() {

    }

    def employeeDetails() {
        Employee employee = createEmployee()
       [employee:employee]
    }

    def urlFormatParameter() {
        Employee employee = createEmployee()

        //use - http://localhost:8080/employee/urlFormatParameter?format=json for json , http://localhost:8080/employee/urlFormatParameter?format=xml for xml
        withFormat {
            html employee: employee //  a format of "all" will trigger the html handler (html is the first block and there is no * block).
            json { render employee as JSON }
            xml { render employee as XML }
        }
    }

    def urlFileExtension() {
        Employee employee = createEmployee()

        //use - http://localhost:8080/employee/contentNegotiation.json for json , http://localhost:8080/employee/contentNegotiation.xml for xml
        respond employee, [model: [employee: employee]]
    }

    def private createEmployee() {
        Employee employee = new Employee()
        Department dep = new Department()
        dep.depID = "1"
        dep.name = "JAVA"
        employee.with {
            empID = "115"
            firstName = "Satish"
            lastName = "Gupta"
            department = dep
        }
        employee
    }

}
