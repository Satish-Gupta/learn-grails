package com.skg.learngrails.ControllerResult

import grails.converters.JSON
import grails.converters.XML

class EmployeeController {

    def index() {

    }

    def showEmployeeDetails() {
        Employee employee = createEmployee()

        //use - http://localhost:8080/employee/contentNegotiation.json for json , http://localhost:8080/employee/contentNegotiation.xml for xml
        respond employee, [model: [employee: employee]]
    }

    def displayEmployeeDetails() {
        Employee employee = createEmployee()

        //use - http://localhost:8080/employee/contentNegotiation.json for json , http://localhost:8080/employee/contentNegotiation.xml for xml
        respond employee
    }

    def getEmployeeDetails() {
        Employee employee = createEmployee()

        // pick the best content type to respond with from the given formats
        respond employee, [formats:['xml', 'json']]
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
