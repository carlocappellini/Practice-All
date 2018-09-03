package com.carlocappellini;

public class Node2 extends ListItem2 {

    public Node2(Object value) {
        super(value);
    }

    @Override
    ListItem2 next() {
        return this.nextLink;
    }

    @Override
    ListItem2 setNext(ListItem2 item) {
        this.nextLink = item;
        return this.nextLink;
    }

    @Override
    ListItem2 previous() {
        return this.previousLink;
    }

    @Override
    ListItem2 setPrevious(ListItem2 item) {
        this.previousLink = item;
        return this.previousLink;
    }


    int comapareTo(ListItem2 item) {

        if (item != null) {

            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }
}
