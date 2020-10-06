package com.rallerenp.brinkapi.entities

import javax.persistence.*

data class Page(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(nullable = false)
        val path: String,

        @ManyToOne
        val gallery: Gallery
)