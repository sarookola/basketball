/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Shayan
 */
public class TeamData implements Serializable {

    String[] lines;
    BasketbalMan manA[], manB[];
    String teamLogoA, teamLogoB;
    String teamNameA, teamNameB;
    String teamCityA, teamCityB;
    String teamCoachA, teamCoachB;
    int showTeam;
    String teamRefree[];

    public TeamData(int maxMan) {
        lines = new String[5];;
        manA = new BasketbalMan[maxMan];
        manB = new BasketbalMan[maxMan];
        for (int i = 0; i < maxMan; i++) {
            manA[i] = new BasketbalMan();
            manB[i] = new BasketbalMan();
        }
        teamLogoA = "";
        teamLogoB = "";
        teamNameA = "";
        teamNameB = "";
        teamCityA = "";
        teamCityB = "";
        teamRefree = new String[3];
        teamRefree[0] = "";
        teamRefree[1] = "";
        teamRefree[2] = "";
    }

    public int getShowTeam() {
        return showTeam;
    }

    public void setShowTeam(int showTeam) {
        this.showTeam = showTeam;
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }

    public String getLines(int index) {
        return lines[index];
    }

    public void setLines(String line, int index) {
        this.lines[index] = line;
    }

    public BasketbalMan[] getManA() {
        return manA;
    }

    public void setManA(BasketbalMan[] manA) {
        this.manA = manA;
    }

    public BasketbalMan getManAbyIndex(int index) {
        return manA[index];
    }

    public void setManAbyIndex(BasketbalMan manA, int index) {
        this.manA[index] = manA;
    }

    public void setManNameNoAbyIndex(String name, int nom, int index) {
        this.manA[index].name = name;
        this.manA[index].nom = nom;
    }

    public void setManNameNoBbyIndex(String name, int nom, int index) {
        this.manB[index].name = name;
        this.manB[index].nom = nom;
    }

    public BasketbalMan[] getManB() {
        return manB;
    }

    public void setManB(BasketbalMan[] manB) {
        this.manB = manB;
    }

    public BasketbalMan getManBbyIndex(int index) {
        return manB[index];
    }

    public void setManBbyIndex(BasketbalMan manB, int index) {
        this.manB[index] = manB;
    }

    public String getTeamLogoA() {
        return teamLogoA;
    }

    public void setTeamLogoA(String teamLogoA) {
        this.teamLogoA = teamLogoA;
    }

    public String getTeamLogoB() {
        return teamLogoB;
    }

    public void setTeamLogoB(String teamLogoB) {
        this.teamLogoB = teamLogoB;
    }

    public String getTeamNameA() {
        return teamNameA;
    }

    public void setTeamNameA(String teamNameA) {
        this.teamNameA = teamNameA;
    }

    public String getTeamNameB() {
        return teamNameB;
    }

    public void setTeamNameB(String teamNameB) {
        this.teamNameB = teamNameB;
    }

    public String getTeamCityA() {
        return teamCityA;
    }

    public void setTeamCityA(String teamCityA) {
        this.teamCityA = teamCityA;
    }

    public String getTeamCityB() {
        return teamCityB;
    }

    public void setTeamCityB(String teamCityB) {
        this.teamCityB = teamCityB;
    }

    public String getTeamCoachA() {
        return teamCoachA;
    }

    public void setTeamCoachA(String teamCoachA) {
        this.teamCoachA = teamCoachA;
    }

    public String getTeamCoachB() {
        return teamCoachB;
    }

    public void setTeamCoachB(String teamCoachB) {
        this.teamCoachB = teamCoachB;
    }

    public String getTeamRefree(int index) {
        return teamRefree[index];
    }

    public void setTeamRefree(String teamRefree, int index) {
        this.teamRefree[index] = teamRefree;
    }


}
