package com.skg.learngrails.databind.mapbased



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class StudentController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Student.list(params), model:[studentInstanceCount: Student.count()]
    }

    def show(Student studentInstance) {
        respond studentInstance
    }

    def create() {
        respond new Student(params)
    }

    @Transactional
    def save() {
        //since a Set is unordered, the indexes don't necessarily correspond to the order of elements in the Set
        def bindingMap = [roll:params.roll,name:params.name,
                          'courses[7]': [courseID:'1', name: 'java'],
                          'courses[4]': [courseID: '2', name: 'database'],
                          'courses[5]': [courseID: '2', name: 'database']]
        def studentInstance = new Student(bindingMap)

        if (studentInstance.hasErrors()) {
            respond studentInstance.errors, view:'create'
            return
        }

        studentInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'student.label', default: 'Student'), studentInstance.id])
                redirect studentInstance
            }
            '*' { respond studentInstance, [status: CREATED] }
        }
    }

    def edit(Student studentInstance) {
        respond studentInstance
    }

    @Transactional
    def update() {
        // update id's before trying
        def bindingMap = [roll:params.roll,name:params.name,
                          'courses[7]': [id: 111, courseID:'1', name: 'abc'],
                          'courses[4]': [id: 222, courseID: '2', name: 'def'],
                          'courses[5]': [id: 333, courseID: '2', name: 'ghi']]
        def studentInstance = Student.get(1)
        studentInstance.properties = bindingMap


        if (studentInstance.hasErrors()) {
            respond studentInstance.errors, view:'edit'
            return
        }

        studentInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Student.label', default: 'Student'), studentInstance.id])
                redirect studentInstance
            }
            '*'{ respond studentInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Student studentInstance) {

        if (studentInstance == null) {
            notFound()
            return
        }

        studentInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Student.label', default: 'Student'), studentInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
