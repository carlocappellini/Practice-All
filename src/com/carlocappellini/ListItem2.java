package com.carlocappellini;

public abstract class ListItem2 {
    protected ListItem2 nextLink;
    protected ListItem2 previousLink;

    protected Object value;

    public ListItem2(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem2 next();

    abstract ListItem2 setNext(ListItem2 item);

    abstract ListItem2 previous();

    abstract ListItem2 setPrevious(ListItem2 item);

    abstract int comapareTo(ListItem2 item);
}
