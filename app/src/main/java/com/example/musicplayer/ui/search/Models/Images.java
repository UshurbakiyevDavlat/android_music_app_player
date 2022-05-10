
package com.example.musicplayer.ui.search.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Images {

    @Override
    public String toString() {
        return "Images{" +
                "background='" + background + '\'' +
                ", coverart='" + coverart + '\'' +
                ", coverarthq='" + coverarthq + '\'' +
                ", joecolor='" + joecolor + '\'' +
                '}';
    }

    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("coverart")
    @Expose
    private String coverart;
    @SerializedName("coverarthq")
    @Expose
    private String coverarthq;
    @SerializedName("joecolor")
    @Expose
    private String joecolor;

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getCoverart() {
        return coverart;
    }

    public void setCoverart(String coverart) {
        this.coverart = coverart;
    }

    public String getCoverarthq() {
        return coverarthq;
    }

    public void setCoverarthq(String coverarthq) {
        this.coverarthq = coverarthq;
    }

    public String getJoecolor() {
        return joecolor;
    }

    public void setJoecolor(String joecolor) {
        this.joecolor = joecolor;
    }

}
