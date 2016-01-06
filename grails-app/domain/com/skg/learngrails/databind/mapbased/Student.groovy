package com.skg.learngrails.databind.mapbased

class Student {
    String roll
    String name

    static hasMany = [courses:Course]
    Set courses
    static constraints = {
    }
}
