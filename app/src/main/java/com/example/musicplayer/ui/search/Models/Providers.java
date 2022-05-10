package com.example.musicplayer.ui.search.Models;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Providers {

   @SerializedName("caption")
   String caption;

   @SerializedName("images")
   Images images;

   @SerializedName("actions")
   List<Actions> actions;

   @SerializedName("type")
   String type;


    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getCaption() {
        return caption;
    }
    
    public void setImages(Images images) {
        this.images = images;
    }
    public Images getImages() {
        return images;
    }
    
    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }
    public List<Actions> getActions() {
        return actions;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
}