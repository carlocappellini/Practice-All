package com.carlocappellini;

import java.util.ArrayList;

public abstract class League<T extends Team<Team>> {


    private String leagueName;

    public ArrayList<Team<T>> teams = new ArrayList<>();

    public String getLeagueName() {
        return leagueName;
    }

    public League(String leagueName) {
        this.leagueName = leagueName;
    }


    public void addTeam(Team<T> team) {


        teams.add(team);

    }


}
