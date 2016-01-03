package com.skg.learngrails.forward

class ProjectController {

    def index() {

    }

    def showDepartment() {
        log.info "#$actionName"
        render "empId: $params.id<br> department: JAVA"
    }
}
