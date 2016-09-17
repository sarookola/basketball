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
 * @author shayan
 */
public class ControolPack implements Serializable {

    Vis_Anim_Bool vis_Anim_Bool[];
    String time;
    Boolean FrameVis, errorVis, timeVis;
    GameData gameData;
    TimePack timePack;
    TeamData teamData;
    boolean ActionTeamColor;
    boolean ActionTeamData;

   
    public boolean isActionTeamColor() {
        return ActionTeamColor;
    }

    public void setActionTeamColor(boolean ActionTeamColor) {
        this.ActionTeamColor = ActionTeamColor;
    }

    public void setVis_Anim_Bool(Vis_Anim_Bool[] vis_Anim_Bool) {
        this.vis_Anim_Bool = vis_Anim_Bool;
    }

    public Vis_Anim_Bool[] getVis_Anim_Bool() {
        return vis_Anim_Bool;
    }

    public TimePack getTimePack() {
        return timePack;
    }

    public void setTimePack(TimePack timePack) {
        this.timePack = timePack;
    }

    public GameData getGameData() {
        return gameData;
    }

    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    public Boolean getErrorVis() {
        return errorVis;
    }

    public void setErrorVis(Boolean errorVis) {
        this.errorVis = errorVis;
    }

    public Boolean getTimeCoverVis() {
//        System.out.println("timevis"+timeVis);
        return timeVis;
    }

    public void setTimeCoverVis(Boolean timeVis) {
        this.timeVis = timeVis;
    }

    /**
     *
     * @return
     */
    public ControolPack(int objectanimCount, int maxname) {
        vis_Anim_Bool = new Vis_Anim_Bool[objectanimCount];
        for (int i = 0; i < objectanimCount; i++) {
            vis_Anim_Bool[i] = new Vis_Anim_Bool();
        }

        FrameVis = false;
        errorVis = false;
        timeVis = false;
        gameData = new GameData();
        timePack = new TimePack();
        teamData = new TeamData(maxname);
    }

    public Boolean getFrameVis() {
        return FrameVis;
    }

    public void setFrameVis(Boolean FrameVis) {
        this.FrameVis = FrameVis;
    }

    public Vis_Anim_Bool getVis_Anim_Bool(int indexOfArray) {
        return vis_Anim_Bool[indexOfArray];
    }

    public void setVis_Anim_Bool(int indexOfArray, Vis_Anim_Bool vis_Anim_Bool) {
        this.vis_Anim_Bool[indexOfArray] = vis_Anim_Bool;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setItemsImagVisible(int item, boolean vis) {
        vis_Anim_Bool[item].setItemsImagVisible(vis);
    }

    public void setItemsTextVisible(int item, boolean vis) {
        vis_Anim_Bool[item].setItemsTextVisible(vis);
    }

    public void setimagePlay(int item, boolean vis) {
        vis_Anim_Bool[item].setImagePlay(vis);
    }

    public void setObjectanim(int item, int animation, boolean vis) {
        vis_Anim_Bool[item].setObjectanim(vis);
        vis_Anim_Bool[item].setMotionDimIndex(animation);
    }

    public TeamData getTeamData() {
        return teamData;
    }

    public void setTeamData(TeamData teamData) {
        this.teamData = teamData;
    }



}
