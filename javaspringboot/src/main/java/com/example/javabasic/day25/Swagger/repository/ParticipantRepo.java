package com.example.javabasic.day25.Swagger.repository;

import com.example.javabasic.day25.Swagger.model.Participants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ParticipantRepo extends JpaRepository<Participants,Long> {
}
