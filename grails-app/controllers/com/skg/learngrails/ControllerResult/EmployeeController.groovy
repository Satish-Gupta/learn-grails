package com.skg.learngrails.ControllerResult

import grails.converters.JSON
import grails.converters.XML
import org.springframework.web.servlet.ModelAndView

class EmployeeController {

    def index() {

    }

    def employeeDetails() {
        Employee employee = createEmployee()
       [employee:employee]
    }

    def showEmployee() {
        Employee employee = createEmployee()

        return new ModelAndView("employeeDetails", [ employee : employee ])
    }

    def displayEmployee() {
        Employee employee = createEmployee()

        render view: "employeeDetails",model: [ employee : employee ]
    }

    def getEmployee() {
        Employee employee = createEmployee()

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
