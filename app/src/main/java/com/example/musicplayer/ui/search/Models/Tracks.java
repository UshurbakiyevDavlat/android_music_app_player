
package com.example.musicplayer.ui.search.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Tracks {

    @SerializedName("tracks")
    @Expose
    private Tracks__1 tracks;
    @SerializedName("artists")
    @Expose
    private Artists artists;

    public Tracks__1 getTracks() {
        return tracks;
    }

    public void setTracks(Tracks__1 tracks) {
        this.tracks = tracks;
    }

    public Artists getArtists() {
        return artists;
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "tracks=" + tracks +
                ", artists=" + artists +
                '}';
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

}
