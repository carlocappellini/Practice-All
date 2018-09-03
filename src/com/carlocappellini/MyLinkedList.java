package com.carlocappellini;

public class MyLinkedList implements NodeList {

    ListItem2 root;

    public MyLinkedList(ListItem2 root) {
        this.root = root;
    }

    @Override
    public boolean addItem(ListItem2 item) {
        return false;
    }

    @Override
    public ListItem2 getRoot() {
        return this.root;
    }

    @Override
    public boolean removeItem() {
        return false;
    }

    @Override
    public void traverse(ListItem2 item) {

    }
}
