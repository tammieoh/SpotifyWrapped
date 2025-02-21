package com.example.spotify.model;

import java.util.ArrayList;

public class User {

    private Long id;
    private String username;
    private String email;
    private ArrayList<Track> tracksListened;

    public User(Long id, String username, String email, ArrayList<Track> tracksListened) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.tracksListened = tracksListened;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
