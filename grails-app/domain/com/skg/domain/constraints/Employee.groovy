package com.skg.domain.constraints

class Employee {

    String name
    String empID
    String joinDate
    String status
    String department
    String age
    String project
    String email
    String designation
    String role

    static constraints = {
        empID nullable: false
        joinDate nullable: true
        status blank: true
        department blank: false
        age blank: true, nullable: true
        project blank: true, nullable: true
        email blank: true, nullable: false
        designation blank: false, nullable: true
        role blank: false, nullable: false
    }
}
