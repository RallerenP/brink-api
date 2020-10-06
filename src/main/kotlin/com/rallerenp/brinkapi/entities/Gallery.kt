package com.rallerenp.brinkapi.entities

import javax.persistence.*

data class Gallery(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(nullable = false)
        val name: String,

        @OneToMany
        val page: Page
)