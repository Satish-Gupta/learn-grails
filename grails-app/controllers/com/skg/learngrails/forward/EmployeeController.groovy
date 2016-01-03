package com.skg.learngrails.forward


class EmployeeController {

    def index() {

    }

    def getEmployeeDetails() {
        log.info "#$actionName"
        forward action: "employeeDetails"
    }

    def employeeDetails() {
        log.info "#$actionName"
        Employee employee = createEmployee()
       [employee:employee]
    }

    def getEmployee() {
        log.info "#$actionName"
        // apparently fragment has no effect in forward
        forward action: "showEmployee", fragment: "bottom"
    }

    def showEmployee() {
        log.info "#$actionName"
        Employee employee = createEmployee()
        render view: 'showEmployee', model:[employee: employee]
    }

    def getEmployeeDepartment() {
        log.info "#$actionName"
        forward controller: "project", action: "showDepartment"
    }

    def readEmployee() {
        log.info "#$actionName"
        forward controller: "project", action: "showDepartment", params: [id:'999']
    }

    def displayEmployeeDepartment() {
        log.info "#$actionName"
        Employee employee = createEmployee()
        forward controller: "project", id: employee.empID,action: "showDepartment"
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
