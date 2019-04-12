package com.example.fSpring.service;

import com.example.fSpring.domain.Comment;
import com.example.fSpring.domain.User;
import com.example.fSpring.repos.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentRepo commentRepo;

    @Autowired
    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    public Comment create(Comment comment, User user) {

        comment.setAuthor(user);
        commentRepo.save(comment);

        return comment;
    }
}
