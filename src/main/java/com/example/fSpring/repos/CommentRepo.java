package com.example.fSpring.repos;

import com.example.fSpring.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}
