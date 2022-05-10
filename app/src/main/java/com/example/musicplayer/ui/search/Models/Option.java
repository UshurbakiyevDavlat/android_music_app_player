
package com.example.musicplayer.ui.search.Models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Option {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("actions")
    @Expose
    private List<Action__1> actions = null;
    @SerializedName("beacondata")
    @Expose
    private Beacondata beacondata;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("listcaption")
    @Expose
    private String listcaption;
    @SerializedName("overflowimage")
    @Expose
    private String overflowimage;
    @SerializedName("colouroverflowimage")
    @Expose
    private Boolean colouroverflowimage;
    @SerializedName("providername")
    @Expose
    private String providername;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Action__1> getActions() {
        return actions;
    }

    public void setActions(List<Action__1> actions) {
        this.actions = actions;
    }

    public Beacondata getBeacondata() {
        return beacondata;
    }

    public void setBeacondata(Beacondata beacondata) {
        this.beacondata = beacondata;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getListcaption() {
        return listcaption;
    }

    public void setListcaption(String listcaption) {
        this.listcaption = listcaption;
    }

    public String getOverflowimage() {
        return overflowimage;
    }

    public void setOverflowimage(String overflowimage) {
        this.overflowimage = overflowimage;
    }

    public Boolean getColouroverflowimage() {
        return colouroverflowimage;
    }

    public void setColouroverflowimage(Boolean colouroverflowimage) {
        this.colouroverflowimage = colouroverflowimage;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

}
