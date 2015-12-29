package com.skg.learngrails.redirect


class EmployeeController {

    def index() {

    }

    def getEmployeeDetails() {
        log.info "#$actionName"
        redirect action: "employeeDetails"
    }

    def employeeDetails() {
        log.info "#$actionName"
        Employee employee = createEmployee()
       [employee:employee]
    }

    def getEmployee() {
        log.info "#$actionName"
        redirect action: "showEmployee", fragment: "bottom"
    }

    def showEmployee() {
        log.info "#$actionName"
        Employee employee = createEmployee()
        render view: 'showEmployee', model:[employee: employee]
    }

    def getEmployeeDepartment() {
        log.info "#$actionName"
        redirect controller: "project", action: "showDepartment"
    }

    def displayEmployeeDepartment() {
        log.info "#$actionName"
        Employee employee = createEmployee()
        redirect controller: "project", id: employee.empID,action: "showDepartment"
    }

    def readEmployee() {
        log.info "#$actionName"
        redirect url:"http://localhost:8080/project/showDepartment"
        //FIXME:
 // not working //        redirect uri:"employee/employeeDetails"
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
