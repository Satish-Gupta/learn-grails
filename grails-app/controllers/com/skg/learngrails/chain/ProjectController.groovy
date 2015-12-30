package com.skg.learngrails.chain

class ProjectController {

    def index() {

    }

    def showDepartment() {
        log.info "#$actionName"
        render view: 'showEmployee', model: [empID:params.id?:chainModel.empID, firstName:chainModel.firstName,lastName:'Gupta', department:chainModel.department]
    }
}
