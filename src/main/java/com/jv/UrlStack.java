package com.jv;

import java.util.ArrayList;
import java.util.List;

public class UrlStack {
    List<Url> stack;
    Boolean myBool = true;
    int i;


    public UrlStack() {
        this.stack = new ArrayList<>();
    }

    public List<Url> getStack() {
        return stack;
    }

    public void setStack(List<Url> stack) {
        this.stack = stack;
    }

    public void addUrl(Url url) {
        if (!this.stack.contains(url))
            stack.add(url);
    }


    public Url getUrl(int index) {
        return stack.get(index);
    }

    public int size() {
        return stack.size();
    }

    public boolean equals(UrlStack u) {
        return u.getStack().equals(this.stack);
    }


}
