/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import base.DrawItemDisplay;
import base.DrawSettingDims;
import base.DrawSettingS;
import java.awt.Color;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shayan
 */
public class SettingPack implements Serializable {

    DrawSettingS[] drawSettingS;
    String font;
    int strok;
    int[] screenDim;
    Color backcolor;
    String path;
    int SeetingCode;
    int currentChildDimIndex;
    int currentParentDimIndex;
    int selectedItem = 0;
    int activedimState = 0;
    int activeDimIndex = 0;

    public SettingPack() {
        path = "";
    }

    public SettingPack(int x) {
        drawSettingS = new DrawSettingS[x];
        font = "Arial";
        for (int i = 0; i < x; i++) {
            drawSettingS[i] = new DrawSettingS();
            drawSettingS[i].setImagevisiblity(false);
            drawSettingS[i].setTextvisiblity(false);
        }

    }
/*
    public void updatedrarray(SettingPack settings) {
        int arraysize = settings.getDrawSettings().length;

        drawSettingS = new DrawSettingS[arraysize];
        for (int i = 0; i < arraysize; i++) {
            drawSettingS[i] = settings.getDrawSettings()[i];
            List<DrawSettingDims[]> ll = new LinkedList<DrawSettingDims[]>();
            for (int j = 0; j < settings.getDrawSettings()[i].getDrawingDimsList().size(); j++) {
                ll.add(settings.getDrawSettings()[i].getDrawingDimsByIndex(j));
            }
            drawSettingS[i].setDrawingDimsList(ll);
        }

    }

   */
    
    public int getSeetingCode() {
        return SeetingCode;
    }

    public void setSeetingCode(int SeetingCode) {
        this.SeetingCode = SeetingCode;
    }

    public DrawSettingS[] getDrawSettings() {
        return drawSettingS;
    }

    public void setDrawinGObjectses(int x) {
        this.drawSettingS = new DrawSettingS[x];
    }

    public int getActiveDimIndex() {
        return activeDimIndex;
    }

    public void setActiveDimIndex(int activeDimIndex) {
        this.activeDimIndex = activeDimIndex;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int[] getScreenDim() {
        return screenDim;
    }

    public void setScreenDim(int[] screenDim) {
        this.screenDim = screenDim;
    }

    public int getStrok() {
        return strok;
    }

    public void setStrok(int strok) {
        this.strok = strok;
    }

    public Color getBackcolor() {
        return backcolor;
    }

    public void setBackcolor(Color backcolor) {
        this.backcolor = backcolor;
    }

    public String getPath() {
        if (path == null) {
            path = "";
        }
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(int selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getActiveDimState() {
        return activedimState;
    }

    public void setActiveDimState(int settingondim) {
        this.activedimState = settingondim;
    }

    public int getCurrentChildDimIndex() {
        return currentChildDimIndex;
    }

    public void setCurrentChildDimIndex(int currentChildDimIndex) {
        this.currentChildDimIndex = currentChildDimIndex;
    }

    public int getCurrentParentDimIndex() {
        return currentParentDimIndex;
    }

    public void setCurrentParentDimIndex(int currentParentDimIndex) {
        this.currentParentDimIndex = currentParentDimIndex;
    }

    public int getXPosByParentByOfsett(int parent, int child, int animstate) {
        int currentParentDimIndex = 0;
        if (drawSettingS[parent].getDrawingDimsList().size() > this.currentParentDimIndex) {
            currentParentDimIndex = this.currentParentDimIndex;
        }
        int px = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getx();
        int pw = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getWidthRelative();
        int cx = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getx();
        int cw = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getWidthRelative();

        return (px + cx * pw / 1000 - (cw * pw) / 2000);
    }

    public int getYPosByParentByOfsett(int parent, int child, int animstate) {
        int currentParentDimIndex = 0;
        if (drawSettingS[parent].getDrawingDimsList().size() >this. currentParentDimIndex) {
            currentParentDimIndex = this.currentParentDimIndex;
        }
        int py = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].gety();
        int ph = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getHeightRelative();
        int cy = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].gety();
        int ch = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getHeightRelative();
        return (py + cy * ph / 1000 - (ch * ph) / 2000);
    }

    public int getXPosByParent(int parent, int child, int animstate) {
        int currentParentDimIndex = 0;
        if (drawSettingS[parent].getDrawingDimsList().size() > this.currentParentDimIndex) {
            currentParentDimIndex = this.currentParentDimIndex;
        }
        int px = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getx();
        int pw = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getWidthRelative();
        int cx = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getx();
        int cw = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getWidthRelative();
        return (px + cx * pw / 1000);
    }

    public int getYPosByParent(int parent, int child, int animstate) {
        int currentParentDimIndex = 0;
        if (drawSettingS[parent].getDrawingDimsList().size() > this.currentParentDimIndex) {
            currentParentDimIndex = this.currentParentDimIndex;
        }
        int py = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].gety();
        int ph = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getHeightRelative();
        int cy = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].gety();
        int ch = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getHeightRelative();
        return (py + cy * ph / 1000);
    }

    public int getWScaleByParent(int parent, int child, int animstate) {
        int currentParentDimIndex = 0;
        if (drawSettingS[parent].getDrawingDimsList().size() > this.currentParentDimIndex) {
            currentParentDimIndex = this.currentParentDimIndex;
        }
        
        int pw = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getWidthRelative();
        int cw = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getWidthRelative();
        return cw * pw / 1000;
    }

    public int getHScaleByParent(int parent, int child, int animstate) {
        int currentParentDimIndex = 0;
        if (drawSettingS[parent].getDrawingDimsList().size() > this.currentParentDimIndex) {
            currentParentDimIndex = this.currentParentDimIndex;
        }
        int ph = drawSettingS[parent].getDrawingDimsByIndex(currentParentDimIndex)[0].getHeightRelative();
        int ch = drawSettingS[child].getDrawingDimsByIndex(currentChildDimIndex)[animstate].getHeightRelative();
        return ch * ph / 1000;
    }

    public int reanimateobjectsByparentGetWscale(DrawItemDisplay parent, int child, int currentFrame, double curentframeDivAllframs) {
//        System.out.println("child: "+child + "      getDrawS: "+getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex).length+"  currenf: "+currentFrame);
        double x1 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame].getWidthRelative();
        double x2 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame + 1].getWidthRelative();
        int wn = (int) (x1 + ((x2 - x1) * curentframeDivAllframs));
        return (int) (wn * parent.getWidthRelative());
    }

    public int reanimateobjectsByparentGetHscale(DrawItemDisplay parent, int child, int currentFrame, double curentframeDivAllframs) {

        double x1 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame].getHeightRelative();
        double x2 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame + 1].getHeightRelative();
        double hn = (x1 + ((x2 - x1) * curentframeDivAllframs));
        return (int) (hn * parent.getHeightRelative());
    }

    public int reanimateobjectsByparentGetXpos(DrawItemDisplay parent, int child, double childWScale, int currentFrame, double curentframeDivAllframs) {

        double x1 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame].getx();
        double x2 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame + 1].getx();
        double xn = (x1 + ((x2 - x1) * curentframeDivAllframs));
        return (int) ((xn * parent.getWidthRelative()) - (childWScale) / 2 + (parent.getxPos()));//((xn * parent.getWidthRelative()) - ((childWScale * parent.getWidthRelative()) / 2) + ((parent.getxRelative()*parent.getWidthRelative()) * 1000000));
//        return(xn);
    }

    public int reanimateobjectsByparentGetYpos(DrawItemDisplay parent, int child, double childHScale, int currentFrame, double curentframeDivAllframs) {

        double x1 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame].gety();
        double x2 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame + 1].gety();
        double yn = (x1 + ((x2 - x1) * curentframeDivAllframs));
        double ynn = ((yn * parent.getHeightRelative()) - (childHScale) / 2 + (parent.getyPos()));
//        System.out.print("\tp h="+parent.getHeightRelative()+"\tc h="+childHScale+"\tyn=" + yn+" \tparent y ="+(parent.getyPos())+" \tynn="+ynn);
        return ((int) ynn);
    }

    public int reanimateobjectsByparentGetOpac(DrawItemDisplay parent, int child, int currentFrame, double curentframeDivAllframs) {

        double x1 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame].getopac();
        double x2 = getDrawSettings()[child].getDrawingDimsByIndex(currentChildDimIndex)[currentFrame + 1].getopac();
        double on = (x1 + ((x2 - x1) * curentframeDivAllframs));
        return (int) (on * parent.getOpac() / 255);
    }

}
