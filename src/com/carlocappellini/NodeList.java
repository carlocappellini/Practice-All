package com.carlocappellini;

public interface NodeList {
    boolean addItem(ListItem2 item);

    ListItem2 getRoot();

    boolean removeItem();

    void traverse(ListItem2 item);
}
