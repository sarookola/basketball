/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import org.omg.CORBA.INTERNAL;

/**
 *
 * @author shayan
 */
public class ScoreHistory {

    int maxhistory = 16;
    int[] score1, score2;

    public int getMaxhistory() {
        return maxhistory;
    }

    public ScoreHistory() {

        score1 = new int[maxhistory];
        score2 = new int[maxhistory];
    }

    public String getscore1(int x) {
        if (x < maxhistory) {
            if (score1[x] > 0) {
                return String.valueOf(score1[x]);
            } else {
                return " ";
            }
        } else {
            return "E";
        }
    }

    public String getscore2(int x) {
        if (x < maxhistory) {
            if (score2[x] > 0) {
                return String.valueOf(score2[x]);
            } else {
                return " ";
            }
        } else {
            return "E";
        }
    }

    public void addscores(int x, int y) {
        for (int i = maxhistory-1; i >0; i--) {
            score1[i] = score1[i-1];
            score2[i] = score2[i-1];
        }
        score1[0] = x;
        score2[0] = y;
    }

   public void removescore() {
       for (int i = 0; i <maxhistory-1; i++) {
            score1[i] = score1[i+1];
            score2[i] = score2[i+1];
        }
    }

    public void reset() {
        for (int i = 0; i <maxhistory; i++) {
            score1[i] = 0;
            score2[i] =0;
        }
    }


}
