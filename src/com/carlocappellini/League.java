package com.carlocappellini;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    private String leagueName;

    private ArrayList<T> league = new ArrayList<>();

    public String getLeagueName() {
        return leagueName;
    }


    public boolean addTeam(T team) {

        if (league.contains(team)) {

            System.out.println("Team already on League");
            return false;


        } else {
            league.add(team);
            System.out.println(team.getName() + " was added to " + this.leagueName);
            return true;
        }

    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {

            System.out.println(t.getName());
        }

    }


}
