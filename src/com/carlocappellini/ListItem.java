package com.carlocappellini;

import java.util.LinkedList;

public abstract class ListItem {

    protected ListItem nextLink;

    protected ListItem previousLink;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract boolean compareTo();

}
