package com.carlocappellini;

import org.w3c.dom.ls.LSInput;

import java.util.List;

public abstract class ListItem {
    protected ListItem nextLink = null;
    protected ListItem previousLink = null;

    protected Node value;

    public ListItem(Node value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Node value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);


}
