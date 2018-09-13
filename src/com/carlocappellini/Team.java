package com.carlocappellini;

import java.util.ArrayList;

public class Team<T extends Jugador> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    //Jugador is abstract class that other 3 classes extend from
    private ArrayList<T> members = new ArrayList<>();


    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T jugador) {
        if (members.contains(jugador)) {
            System.out.println(jugador.getName() + " is already on this team");
            return false;
        } else {
            members.add(jugador);
            System.out.println(jugador.getName() + " was picked for team " + this.name);
            return true;
        }
    }


    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
       String message;

        if (ourScore > theirScore) {
            message = " beat ";
            won++;
        } else if (ourScore == theirScore) {
            message = " draw with ";
            tied++;
        } else {
            message = " lost to ";
            lost++;
        }

        played++;
        if (opponent != null) {
            System.out.println(this.getName() + " " + message + " " + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);

        }


    }

    public int ranking() {
        return (won * 2) + tied;
    }



    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    ///MAIN

    public static void main(String[] args) {










    }

}

