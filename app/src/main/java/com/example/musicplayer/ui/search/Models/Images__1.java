
package com.example.musicplayer.ui.search.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Images__1 {

    @SerializedName("overflow")
    @Expose
    private String overflow;
    @SerializedName("default")
    @Expose
    private String _default;

    public String getOverflow() {
        return overflow;
    }

    public void setOverflow(String overflow) {
        this.overflow = overflow;
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

}
