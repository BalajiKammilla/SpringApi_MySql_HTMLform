package com.example.SB_form2

import jakarta.persistence.*

@Entity
@Table(name = "form_req")
data class FormRequest(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        val id:Int,

        @Column(name = "name")
        val name:String,

        @Column(name="email")
        val email:String
)
