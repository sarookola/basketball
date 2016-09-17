/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.BasketbalMan;
import DataBox.TeamData;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shayan
 */
public class FileManipulatBasket {

    void readTeamName(String path, TeamData teamData, int aOrB) {
        FileReader fileReader = null;
        BufferedReader reader = null;
        int arraySize = teamData.getManA().length;
        BasketbalMan bm[] = new BasketbalMan[arraySize];
        for (int i = 0; i < arraySize; i++) {
            bm[i] = new BasketbalMan();

        }
        int index = 0;
        String stnames[] = {"", "", "", ""};
        try {
            //fileReader = new FileReader(path);
            reader =// new BufferedReader(fileReader );
                    new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(path), "UTF8"));
            reader.read();
            for (int i = 0; i < stnames.length; i++) {
                stnames[i] = reader.readLine();
            }
            String st;
            st = reader.readLine();
            do {
                bm[index].setNo(Integer.parseInt(st));
                st = reader.readLine();
                bm[index].setName(st);
                index++;
                st = reader.readLine();
            } while (st != null);
        } catch (IOException ex) {
            Logger.getLogger(FileManipulatBasket.class.getName()).log(Level.SEVERE, null, ex);
//            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
//                fileReader.close();
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManipulatBasket.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        switch (aOrB) {
            case 0:
                teamData.setTeamNameA(stnames[0]);
                teamData.setTeamCityA(stnames[1]);
                teamData.setTeamCoachA(stnames[2]);
                teamData.setTeamLogoA(stnames[3]);
                teamData.setManA(bm);
                break;
            case 1:
                teamData.setTeamNameB(stnames[0]);
                teamData.setTeamCityB(stnames[1]);
                teamData.setTeamCoachB(stnames[2]);
                teamData.setTeamLogoB(stnames[3]);
                teamData.setManB(bm);
                break;

        }
    }

}
