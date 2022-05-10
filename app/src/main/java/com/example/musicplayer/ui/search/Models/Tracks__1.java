
package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tracks__1 {

    @SerializedName("hits")
    @Expose
    private List<Hit> hits = null;

    @Override
    public String toString() {
        return "Tracks__1{" +
                "hits=" + hits +
                '}';
    }

    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

}
