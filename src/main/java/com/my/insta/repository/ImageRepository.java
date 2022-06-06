package com.my.insta.repository;

import com.my.insta.entity.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByUserId(Long userId);
    Optional<ImageModel> findByPostId(Long postId);

}
