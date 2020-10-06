package com.rallerenp.brinkapi.repositories;

import com.rallerenp.brinkapi.entities.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GalleryRepository extends JpaRepository<Gallery, Long>
{
    Gallery getGalleryById();

}
