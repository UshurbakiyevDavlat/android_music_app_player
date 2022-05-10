package com.example.musicplayer.ui.search.Models;

import com.google.gson.annotations.SerializedName;

   
public class Actions {

   @SerializedName("name")
   String name;

   @SerializedName("type")
   String type;

   @SerializedName("uri")
   String uri;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getUri() {
        return uri;
    }
    
}