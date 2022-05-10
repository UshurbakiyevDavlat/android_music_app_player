package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.SerializedName;

   
public class ExampleJson2KtPOJO {

   @SerializedName("tracks")
   Tracks tracks;

   @SerializedName("artists")
   Artists artists;


    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "ExampleJson2KtPOJO{" +
                "tracks=" + tracks +
                ", artists=" + artists +
                '}';
    }

    public Tracks getTracks() {
        return tracks;
    }
    
    public void setArtists(Artists artists) {
        this.artists = artists;
    }
    public Artists getArtists() {
        return artists;
    }
    
}