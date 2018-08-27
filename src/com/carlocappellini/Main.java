package com.carlocappellini;

public class Main {

    public static void main(String[] args) {

        Saveable jessica = new Player("Jess", 100, 200);

        System.out.println(jessica.write());

        saveObject(jessica);

        ((Player) jessica).setStrength(300);

        saveObject(jessica);

    }

    static void saveObject(Saveable objectToSave){
        for (int i = 0 ; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i));

        }


    }
}
