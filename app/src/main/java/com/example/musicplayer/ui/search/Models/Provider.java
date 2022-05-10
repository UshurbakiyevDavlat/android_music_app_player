
package com.example.musicplayer.ui.search.Models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Provider {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("images")
    @Expose
    private Images__1 images;
    @SerializedName("actions")
    @Expose
    private List<Action__2> actions = null;
    @SerializedName("type")
    @Expose
    private String type;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Images__1 getImages() {
        return images;
    }

    public void setImages(Images__1 images) {
        this.images = images;
    }

    public List<Action__2> getActions() {
        return actions;
    }

    public void setActions(List<Action__2> actions) {
        this.actions = actions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
