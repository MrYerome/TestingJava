package com.jv;

public class Url {
    String url;

    public Url(String url){
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object object){
        return (this.url.equals(((Url) object).getUrl()));
    }
}
