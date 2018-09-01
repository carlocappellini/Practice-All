package com.carlocappellini;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextLink = item;
        return this.nextLink;
    }

    @Override
    ListItem previous() {
        return this.previousLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousLink = item;
        return this.previousLink;
    }

    @Override
    boolean compareTo() {
        return false;
    }
}
