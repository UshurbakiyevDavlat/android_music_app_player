
package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Artists {

    @SerializedName("hits")
    @Expose
    private List<Hit__1> hits = null;

    public List<Hit__1> getHits() {
        return hits;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "hits=" + hits +
                '}';
    }

    public void setHits(List<Hit__1> hits) {
        this.hits = hits;
    }

}
