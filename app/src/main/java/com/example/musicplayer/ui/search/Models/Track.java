
package com.example.musicplayer.ui.search.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Track {

    @SerializedName("layout")
    @Expose
    private String layout;

    @Override
    public String toString() {
        return "Track{" +
                "layout='" + layout + '\'' +
                ", type='" + type + '\'' +
                ", key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", share=" + share +
                ", images=" + images +
                ", hub=" + hub +
                ", artists=" + artists +
                ", url='" + url + '\'' +
                '}';
    }

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("share")
    @Expose
    private Share share;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("hub")
    @Expose
    private Hub hub;
    @SerializedName("artists")
    @Expose
    private List<Artist> artists = null;
    @SerializedName("url")
    @Expose
    private String url;

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Share getShare() {
        return share;
    }

    public void setShare(Share share) {
        this.share = share;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Hub getHub() {
        return hub;
    }

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
