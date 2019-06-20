package com.jv;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Page {
    String url;
    Document dom;

    public Page() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Document getDom() {
        return dom;
    }

    public void setDom(Document dom) {
        this.dom = dom;
    }

    public void loadDom() throws IOException {
        this.dom = Jsoup.connect(url).get();
    }

    public void loadDomFromHtmlString(String html) {
        this.dom = Jsoup.parse(html);
    }

    public List extractLinks() throws IOException {
        Elements pageLinks = this.dom.select("a[href]");
        List links = new ArrayList();
        for (Element element : pageLinks) {
            Link myLinkUrl = new Link(new Url(element.attr("href")), element.text());
            links.add(myLinkUrl);
            System.out.println(myLinkUrl.getUrl().getUrl());
        }
        return links;
    }

}
