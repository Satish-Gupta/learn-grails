package com.skg.learngrails.databind.mapbased

class Playlist {
    String name
    static hasMany = [songs: Song]
    Map songs
    static constraints = {
    }
}
