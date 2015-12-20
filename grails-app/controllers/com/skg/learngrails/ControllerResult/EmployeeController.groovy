package com.skg.learngrails.ControllerResult

import grails.converters.JSON
import grails.converters.XML
import org.springframework.web.servlet.ModelAndView

class EmployeeController {

    def index() {

    }

    def renderText() {
        render "rendered text"
    }

    def renderXML() {
        // renders text for a specified content-type/encoding
        render(text: "<xml>some xml</xml>", contentType: "text/xml", encoding: "UTF-8")
    }

    def renderViewWithModel() {
        Employee employee = createEmployee()

        render view: "employeeDetails",model: [ employee : employee ]
    }

    def renderViewWithCollection() {
        Employee employee1 = createEmployee()
        Employee employee2 = createEmployee()
        employee2.empID = '123'
        employee2.firstName = 'Manish'

        // render each item in the collection using the specified template
        render template: "employee-details-template", collection: [employee1, employee2]
    }

    def renderViewWithBean() {
        Employee employee = createEmployee()


        // render each item in the collection using the specified template
        render template: "employee-details-template", bean:employee
    }

    def renderViewOnly() {

        render view:"simple-text"
    }

    def renderMarkup() {
        render {
            div(id: "myDiv", "some text inside the div")
        }
    }

    def renderXML1() {
        Employee employee1 = createEmployee()
        Employee employee2 = createEmployee()
        employee2.empID = '123'
        employee2.firstName = 'Manish'
        List employeeList = [employee1,employee2]
        // render some XML markup to the response
        render(contentType: "text/xml") {
            employees {
                for (emp in employeeList) {
                    employee(id:emp.empID,name: emp.firstName)
                }
            }
        }
    }

    def renderJSON() {
        Employee employee1 = createEmployee()
        Employee employee2 = createEmployee()
        employee2.empID = '123'
        employee2.firstName = 'Manish'
        List employeeList = [employee1,employee2]
        // render a JSON ( http://www.json.org ) response with the builder attribute:
        //FIXME: the following displays only one object details
        render(contentType: "application/json") {
            employees {
                for (emp in employeeList) {
                    employee(id:emp.empID,name: emp.firstName)
                }
            }
        }
    }

    def getEmployeeAsJSON() {
        Employee employee1 = createEmployee()
        Employee employee2 = createEmployee()
        employee2.empID = '123'
        employee2.firstName = 'Manish'
        List employees = [employee1,employee2]

        render employees as JSON
//        render employees as XML
    }

    def renderFile() {
//        ?????????
//        ?????
//        ?????
//        ??????
//        ??????
        File file = new File("/home/satish/developer_bichara")
        // render a file
        render(file: file, fileName: "file", contentType: "image/jpeg")
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
