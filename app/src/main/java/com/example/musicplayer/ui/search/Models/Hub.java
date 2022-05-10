
package com.example.musicplayer.ui.search.Models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Hub {

    @Override
    public String toString() {
        return "Hub{" +
                "type='" + type + '\'' +
                ", image='" + image + '\'' +
                ", actions=" + actions +
                ", options=" + options +
                ", providers=" + providers +
                ", explicit=" + explicit +
                ", displayname='" + displayname + '\'' +
                '}';
    }

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("actions")
    @Expose
    private List<Action> actions = null;
    @SerializedName("options")
    @Expose
    private List<Option> options = null;
    @SerializedName("providers")
    @Expose
    private List<Provider> providers = null;
    @SerializedName("explicit")
    @Expose
    private Boolean explicit;
    @SerializedName("displayname")
    @Expose
    private String displayname;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

}
