package com.carlocappellini;

public class Node extends ListItem {
    Node root;


    public Node(Node value) {
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
    int compareTo(ListItem item) {
        if (item != null) {


            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;


    }
}

