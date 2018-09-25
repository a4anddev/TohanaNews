
package com.tohananews.tohana.tohananews.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TohanaNewsModel {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("newsmodel")
    @Expose
    private List<Newsmodel> newsmodel = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Newsmodel> getNewsmodel() {
        return newsmodel;
    }

    public void setNewsmodel(List<Newsmodel> newsmodel) {
        this.newsmodel = newsmodel;
    }

}
