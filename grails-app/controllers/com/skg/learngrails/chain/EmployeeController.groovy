package com.skg.learngrails.chain


class EmployeeController {

    def index() {

    }

    def getEmployeeDetails() {
        log.info "#$actionName"
        chain action: "employeeDetails", model:[empID:'111', firstName:'satish', department: 'java']
    }

    def employeeDetails() {
        log.info "#$actionName"
       [empID:'115',lastName:'gupta']
    }

    def getEmployee() {
        log.info "#$actionName"
        chain action: "showEmployee", fragment:'bottom',model:[empID:'111', firstName:'satish', department: 'java']
    }

    def showEmployee() {
        log.info "#$actionName"
        Employee employee = createEmployee()
        render view: 'showEmployee', model:[empID:'115',lastName:'gupta']
    }

    def getEmployeeDepartment() {
        log.info "#$actionName"
        chain controller: "project", action: "showDepartment", model: [empID:'111', firstName:'satish', department: 'java']
    }

    def displayEmployeeDepartment() {
        log.info "#$actionName"
        chain controller: "project", action: "showDepartment",id: '22234', model: [empID:'111', firstName:'satish', department: 'java']
    }

    def readEmployee() {
        log.info "#$actionName"
        //FIXME
        chain uri:"project/showDepartment", model: [empID:'111', firstName:'satish', department: 'java']
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
