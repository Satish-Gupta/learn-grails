package com.skg.learngrails.databind.mapbased


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BandController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Band.list(params), model: [bandInstanceCount: Band.count()]
    }

    def show(Band bandInstance) {
        respond bandInstance
    }

    def create() {
        respond new Band(params)
    }

    @Transactional
    def save() {
        def bindingMap = [name: 'Genesis',
                          'albums[2]': [title: 'Foxtrot', numberOfTracks: 6],
                          'albums[0]': [title: 'Nursery Cryme', numberOfTracks: 7],
                          'albums[1]': [title: 'XYZ', numberOfTracks: 3]]
        def bandInstance = new Band(bindingMap)

        if (bandInstance.hasErrors()) {
            respond bandInstance.errors, view: 'create'
            return
        }

        bandInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'band.label', default: 'Band'), bandInstance.id])
                redirect bandInstance
            }
            '*' { respond bandInstance, [status: CREATED] }
        }
    }

    def edit(Band bandInstance) {
        respond bandInstance
    }

    @Transactional
    def update(Band bandInstance) {
        if (bandInstance == null) {
            notFound()
            return
        }

        if (bandInstance.hasErrors()) {
            respond bandInstance.errors, view: 'edit'
            return
        }

        bandInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Band.label', default: 'Band'), bandInstance.id])
                redirect bandInstance
            }
            '*' { respond bandInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Band bandInstance) {

        if (bandInstance == null) {
            notFound()
            return
        }

        bandInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Band.label', default: 'Band'), bandInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'band.label', default: 'Band'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
