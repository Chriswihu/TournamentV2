package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Team extends FileIO
{
    private String[] team;

    public Team()
    {
        team = new String[5];

    }

    public void addPlayerToTeam(Player player)
    {
        for(int i = 0; i < team.length; i++)
        {
            team[i].add(player);
        }
    }

    @Override
    public String[] getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team=" + Arrays.toString(team) +
                '}';
    }
}
