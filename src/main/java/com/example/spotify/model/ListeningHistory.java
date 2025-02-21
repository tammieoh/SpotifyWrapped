package com.example.spotify.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "listening_history")
public class ListeningHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment primary key
    private Long id;

    @ManyToOne // Many listening history records can be associated with one user
    // each listening history belongs to one user
    // or one user can have many listening history records
    @JoinColumn(name = "user_id", nullable = false) // look at the user table, can't be null
    // nullable = false means each listening history object must have a user
    // associated
    private User user;

    @ManyToOne
    @JoinColumn(name = "track_id", nullable = false)
    private Track track;

    // date when the track was listened to
    private LocalDate date;

    // num of times it was listened to that day
    private int listenCount;

    public ListeningHistory(Long id, User user, Track track, LocalDate date, int listenCount) {
        this.id = id;
        this.user = user;
        this.track = track;
        this.date = date;
        this.listenCount = listenCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setLocalDate(LocalDate date) {
        this.date = date;
    }

    public int getListenCount() {
        return listenCount;
    }

    public void setListenCount(int listenCount) {
        this.listenCount = listenCount;
    }
}
