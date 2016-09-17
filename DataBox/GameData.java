/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Shayan
 */
public class GameData implements Serializable {

    String period;
    String[] qUpointsTop, qUpointsBot;
    String teamTopName, teamBotName;
    Color colorTop, colorBot;
    int PointTop, PointBot;
    int pointOldTop, pointOldBot;
    int foulTop, foulBot;
    String quName;
    String TeamPic[];
    String timerCoverPic;
    Color teamaColor[];

    public GameData() {
        qUpointsBot = new String[5];
        qUpointsTop = new String[5];
        colorTop = new Color(0xff0000);
        colorBot = new Color(0x00ff00);
        quName = "1";
        period = "1";
        teamTopName = "111";
        teamBotName = "999";
        TeamPic = new String[2];
        TeamPic[0] = "pictures\\testPicShayan.png";
        TeamPic[1] = "pictures\\testPicShayan.png";
        timerCoverPic = "pictures\\testPicShayan.png";
        teamaColor = new Color[2];
        teamaColor[0] = new Color(0xffffff);
        teamaColor[1] = new Color(0xffffff);

    }

    public Color[] getTeamaColor() {
        return teamaColor;
    }

    public void setTeamaColor(Color[] teamaColor) {
        this.teamaColor = teamaColor;
    }

    public String getTimerCoverPic() {
        return timerCoverPic;
    }

    public void setTimerCoverPic(String timerCoverPic) {
        this.timerCoverPic = timerCoverPic;
    }

    public String[] getTeamPic() {
        return TeamPic;
    }

    public String getTeamPic(int index) {
        return TeamPic[index];
    }

    public void setTeamPic(String st, int index) {
        TeamPic[index] = st;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String[] getqUpointsTop() {
        return qUpointsTop;
    }

    public void setqUpointsTop(String[] qUpointsTop) {
        this.qUpointsTop = qUpointsTop;
    }

    public String[] getqUpointsBot() {
        return qUpointsBot;
    }

    public void setqUpointsBot(String[] qUpointsBot) {
        this.qUpointsBot = qUpointsBot;
    }

    public String getTeamTopName() {
        return teamTopName;
    }

    public void setTeamTopName(String teamTopName) {
        this.teamTopName = teamTopName;
    }

    public String getTeamBotName() {
        return teamBotName;
    }

    public void setTeamBotName(String teamBotName) {
        this.teamBotName = teamBotName;
    }

    public String[] getGpointsTop() {
        return qUpointsTop;
    }

    public void setGpointsTop(String[] gpointsTop) {
        this.qUpointsTop = gpointsTop;
    }

    public String[] getGpointsBot() {
        return qUpointsBot;
    }

    public void setGpointsBot(String[] gpointsBot) {
        this.qUpointsBot = gpointsBot;
    }

    public Color getColorTop() {
        return colorTop;
    }

    public void setColorTop(Color colorTop) {
        this.colorTop = colorTop;
    }

    public Color getColorBot() {
        return colorBot;
    }

    public void setColorBot(Color colorBot) {
        this.colorBot = colorBot;
    }

    public int getPointTop() {
        return PointTop;
    }

    public void setPointTop(int PointTop) {
        this.PointTop = PointTop;
    }

    public int getPointBot() {
        return PointBot;
    }

    public void setPointBot(int PointBot) {
        this.PointBot = PointBot;
    }

    public int getPointOldTop() {
        return pointOldTop;
    }

    public void setPointOldTop(int pointOldTop) {
        this.pointOldTop = pointOldTop;
    }

    public int getPointOldBot() {
        return pointOldBot;
    }

    public void setPointOldBot(int pointOldBot) {
        this.pointOldBot = pointOldBot;
    }

  

    public int getFoulTop() {
        return foulTop;
    }

    public void setFoulTop(int foulTop) {
        this.foulTop = foulTop;
    }

    public int getFoulBot() {
        return foulBot;
    }

    public void setFoulBot(int foulBot) {
        this.foulBot = foulBot;
    }

    public String getQuName() {
        return quName;
    }

    public void setQuName(String quName) {
        this.quName = quName;
    }

}
