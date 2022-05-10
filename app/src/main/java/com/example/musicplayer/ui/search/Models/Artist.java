
package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Artist {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("adamid")
    @Expose
    private String adamid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdamid() {
        return adamid;
    }

    public void setAdamid(String adamid) {
        this.adamid = adamid;
    }

}
