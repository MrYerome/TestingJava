package com.jv;

public class Link {

    Url url;
    String anchor;

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public Link(Url url, String anchor) {
        this.url = url;
        this.anchor = anchor;
    }

    public boolean equals (Link l){
        return (this.anchor.equals(l.getAnchor()));
    }
}
