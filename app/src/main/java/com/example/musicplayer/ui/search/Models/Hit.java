
package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Hit {

    @Override
    public String toString() {
        return "Hit{" +
                "track=" + track +
                '}';
    }

    @SerializedName("track")
    @Expose
    private Track track;

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}
