package com.example.spotify.model;

import java.util.ArrayList;

public class Artist {

    private int id;
    private String name;
    private int spotifyId;
    private String genre;
    private ArrayList<Track> tracks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpotifyId() {
        return spotifyId;
    }

    public void setSpotifyId(int spotifyId) {
        this.spotifyId = spotifyId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

}
