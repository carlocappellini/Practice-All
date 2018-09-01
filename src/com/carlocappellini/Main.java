package com.carlocappellini;

//        Saveable jessica = new Player("Jess", 100, 200);
//                System.out.println(jessica.write());
//                saveObject(jessica);
//                ((Player) jessica).setStrength(300);
//                saveObject(jessica);
//                }
//static void saveObject(Saveable objectToSave){
//        for (int i = 0 ; i < objectToSave.write().size(); i++){
//        System.out.println("Saving " + objectToSave.write().get(i));
//        }

public class Main {

    public static void main(String[] args) {

        int five = 5;
        int four = 4;


        String a = "5";
        String b = "6";

//        System.out.println(a.compareTo(b));
//        System.out.println(b.compareTo(a));

//        MyLinkedList linkedList = new MyLinkedList(null);

//        Node node = new Node("4");
//        Node node1 = new Node("3");
//        Node node2 = new Node("2");


//        linkedList.addItem(node);
//        linkedList.addItem(node1);
//        linkedList.addItem(node2);

//        String stringData = "carlo ag ggd";
//
//        String [] data = stringData.split(" ");
//
//
//        for(String s: data){
//            linkedList.addItem(new Node(s));
//        }
        MyLinkedList list = new MyLinkedList(null);
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());






    }
}
