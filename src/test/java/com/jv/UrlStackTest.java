package com.jv;

import junit.framework.TestCase;

public class UrlStackTest extends TestCase {

    private UrlStack stack;

    public void setUp() {
        this.stack = new UrlStack();
    }

    public void testAddUrl(){
        Url url = new Url("http://www.yahoo.fr");
        this.stack.addUrl(url);
        assertEquals(true,stack.size()==1);
        assertTrue(stack.getUrl(0).equals(url));
        Url url2 = new Url("http://www.google.fr");
        this.stack.addUrl(url2);
        assertTrue(stack.size()==2);
        assertTrue(stack.getUrl(0).equals(url));
        assertTrue(stack.getUrl(1).equals(url2));
    }

    public void testAddExistingURl(){
        stack.addUrl(new Url("http://www.yahoo.fr"));
        stack.addUrl(new Url("http://www.google.fr"));
        this.stack.addUrl(new Url("http://www.yahoo.fr"));
        for (Url urlExisting : stack.getStack()){
            System.out.println(urlExisting.getUrl());
        }
        assertTrue(stack.size()==2);
        assertTrue(stack.getUrl(0).equals(new Url("http://www.yahoo.fr")));
        assertTrue(stack.getUrl(1).equals(new Url("http://www.google.fr")));
    }


}
