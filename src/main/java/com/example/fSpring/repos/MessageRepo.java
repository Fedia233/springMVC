package com.example.fSpring.repos;

import com.example.fSpring.domain.Message;
import com.example.fSpring.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    @EntityGraph(attributePaths = "comments")
    Page<Message> findByAuthorIn(List<User> users, Pageable pageable);
}
