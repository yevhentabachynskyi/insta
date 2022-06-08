package com.my.insta.repository;

import com.my.insta.entity.Comment;
import com.my.insta.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPost(Post post);
    Comment findByIdAndAndUserId(Long commentId, Long userId);

}

