package com.jv;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("hello !");
        Url myUrl = new Url("https://news.google.com");
        Link myLink = new Link(myUrl, "anchor");


        Page myPage = new Page();
        myPage.url="https://news.google.com";
        myPage.loadDom();
        myPage.extractLinks();
    }
}
