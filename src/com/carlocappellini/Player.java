package com.carlocappellini;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.strength);
        values.add(2, "" + this.health);
        return values;
    }

    @Override
    public void read(List<String> list) {

        this.name = list.get(0);
        this.health = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));


    }

    private String name;
    private int health;
    private int strength;

    public Player(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
