package com.rallerenp.brinkapi.services

import com.rallerenp.brinkapi.entities.Gallery

interface IGalleryService
{
    fun getAllGalleries(): Gallery
}