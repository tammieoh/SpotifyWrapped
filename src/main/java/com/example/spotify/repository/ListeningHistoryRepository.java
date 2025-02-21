package com.example.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spotify.model.ListeningHistory;

@Repository
public interface ListeningHistoryRepository extends JpaRepository<ListeningHistory, Long> {

}
