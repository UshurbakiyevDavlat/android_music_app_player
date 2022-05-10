package com.example.musicplayer.ui.search.Models;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Options {

   @SerializedName("caption")
   String caption;

   @SerializedName("actions")
   List<Actions> actions;

   @SerializedName("beacondata")
   Beacondata beacondata;

   @SerializedName("image")
   String image;

   @SerializedName("type")
   String type;

   @SerializedName("listcaption")
   String listcaption;

   @SerializedName("overflowimage")
   String overflowimage;

   @SerializedName("colouroverflowimage")
   boolean colouroverflowimage;

   @SerializedName("providername")
   String providername;


    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getCaption() {
        return caption;
    }
    
    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }
    public List<Actions> getActions() {
        return actions;
    }
    
    public void setBeacondata(Beacondata beacondata) {
        this.beacondata = beacondata;
    }
    public Beacondata getBeacondata() {
        return beacondata;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setListcaption(String listcaption) {
        this.listcaption = listcaption;
    }
    public String getListcaption() {
        return listcaption;
    }
    
    public void setOverflowimage(String overflowimage) {
        this.overflowimage = overflowimage;
    }
    public String getOverflowimage() {
        return overflowimage;
    }
    
    public void setColouroverflowimage(boolean colouroverflowimage) {
        this.colouroverflowimage = colouroverflowimage;
    }
    public boolean getColouroverflowimage() {
        return colouroverflowimage;
    }
    
    public void setProvidername(String providername) {
        this.providername = providername;
    }
    public String getProvidername() {
        return providername;
    }
    
}