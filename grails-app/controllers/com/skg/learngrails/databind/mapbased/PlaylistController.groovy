package com.skg.learngrails.databind.mapbased



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PlaylistController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Playlist.list(params), model:[playlistInstanceCount: Playlist.count()]
    }

    def show(Playlist playlistInstance) {
        respond playlistInstance
    }

    def create() {
        respond new Playlist(params)
    }

    @Transactional
    def save() {
        def bindingMap = [name: params.name,
                          'songs[nepali]': [name: 'aaaaaaaaaaaa'],
                          'songs[hindi]': [name: 'lalaaaaaaaaaaaaa'],
                          'songs[english]': [name: 'kladlfl asdjfl']]
        def playlistInstance = new Playlist(bindingMap)


        if (playlistInstance.hasErrors()) {
            respond playlistInstance.errors, view:'create'
            return
        }

        playlistInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'playlist.label', default: 'Playlist'), playlistInstance.id])
                redirect playlistInstance
            }
            '*' { respond playlistInstance, [status: CREATED] }
        }
    }

    def edit(Playlist playlistInstance) {
        respond playlistInstance
    }

    @Transactional
    def update() {
        //When updating an existing Map, if the key specified in the binding Map does not exist in the Map being bound to then a new value will be created and added to the Map with the specified key
        def bindingMap = [name: params.name,
                          'songs[nepali]': [name: 'aaaaaaaaaaaa'],
                          'songs[hindi]': [name: 'lalaaaaaaaaaaaaa'],
                          'songs[english]': [name: 'kladlfl asdjfl'],
                          'songs[dontknowwhat]': [name: 'bbbbbbbbbb'],
                          'songs[someother]': [name: 'ccccccccc']]
        def playlistInstance = Playlist.get(params.id)
        playlistInstance.properties = bindingMap


        if (playlistInstance.hasErrors()) {
            respond playlistInstance.errors, view:'edit'
            return
        }

        playlistInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Playlist.label', default: 'Playlist'), playlistInstance.id])
                redirect playlistInstance
            }
            '*'{ respond playlistInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Playlist playlistInstance) {

        if (playlistInstance == null) {
            notFound()
            return
        }

        playlistInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Playlist.label', default: 'Playlist'), playlistInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'playlist.label', default: 'Playlist'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
