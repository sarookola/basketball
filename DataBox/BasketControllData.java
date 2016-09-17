/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

/**
 *
 * @author Shayan
 */
public class BasketControllData {

    static int qmax = 5;
    String[] quName;
    boolean showTeamName[];
    String path;

    public BasketControllData() {
        quName = new String[qmax];
        for (int i = 0; i < qmax; i++) {
            quName[i] = String.valueOf(i);
        }
        path = "";
        showTeamName = new boolean[2];
    }

    public String getQuName(int index) {
        return quName[index];
    }

    public void setQuName(String quName, int index) {
        if (index < qmax) {
            this.quName[index] = quName;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static int getQmax() {
        return qmax;
    }

    public boolean[] getShowTeamName() {
        return showTeamName;
    }

    public void setShowTeamName(boolean showTeamNameA,boolean showTeamNameB) {
        this.showTeamName[0] = showTeamNameA;
        this.showTeamName[1] = showTeamNameB;
        
        
    }

}
