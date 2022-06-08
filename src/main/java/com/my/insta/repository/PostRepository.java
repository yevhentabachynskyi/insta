package com.my.insta.repository;

import com.my.insta.entity.Post;
import com.my.insta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByUserOrderByCreatedDateDesc(User user);
    List<Post> findAllByOrOrderByCreatedDateDesc();
    Optional<Post> findPostByIdAndUser(Long id, User user);
}
