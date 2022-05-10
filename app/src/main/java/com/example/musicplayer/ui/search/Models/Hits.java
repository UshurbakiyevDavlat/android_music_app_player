package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.SerializedName;

   
public class Hits {

   @SerializedName("artist")
   Artist artist;


    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    public Artist getArtist() {
        return artist;
    }
    
}