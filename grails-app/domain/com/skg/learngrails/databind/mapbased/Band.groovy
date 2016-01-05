package com.skg.learngrails.databind.mapbased

class Band {
    String name
    static hasMany = [albums: Album]
    List albums
    static constraints = {
    }
}
