/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;


import java.awt.Color;
import java.io.Serializable;


/**
 *
 * @author shayan
 */
public class DrawSettingDims implements Serializable{
//    Rectangle2D rectangle;
    String name;
    int xRelative;
    int yRelative;
    int widthRelative;
    int heightRelative;
    int startsAccceleration , endAccceleration;
    Color strokC;
    Color textC;
//     Color back;
    
    int opac;
    int frames;

    public DrawSettingDims() {
        opac=255;
        textC= Color.white;
        strokC= Color.BLACK;
        xRelative=200;
        yRelative=200;
        widthRelative=250;
        heightRelative=250;
        frames=15;
    }
    


 

    public DrawSettingDims(int xRelative, int yRelative, int widthRelative, int heightRelative, String text1) {
        this.xRelative = xRelative;
        this.yRelative = yRelative;
        this.widthRelative = widthRelative;
        this.heightRelative = heightRelative;  
    }

    public void setxRelative(int xRelative) {
        this.xRelative = xRelative;
    }

    public void setyRelative(int yRelative) {
        this.yRelative = yRelative;
    }

    public void setWidthRelative(int widthRelative) {
        this.widthRelative = widthRelative;
    }

    public void setHeightRelative(int heightRelative) {
        this.heightRelative = heightRelative;
    }

    public int getFrames() {
        return frames;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }


    public void setStrokC(Color strokC) {
        this.strokC = strokC;
    }

    public void setTextC(Color textC) {
        this.textC = textC;
    }



    public void setOpac(int alpha) {
        this.opac = alpha;
    }


    public int getxRelative() {
        return xRelative-widthRelative/2;
    }
 public int getx() {
        return xRelative;
    }
  public int gety(){
        return yRelative;
    }
 
    public int getyRelative() {
        return yRelative-heightRelative/2;
    }

    public int getWidthRelative() {
        return widthRelative;
    }

    public int getHeightRelative() {
        return heightRelative;
    }



    public Color getStrokC() {
        return strokC;
    }

    public Color getTextC() {
        return textC;
    }


    public int getopac() {
        return opac;
    }

public void setDim(int dim[])
{
   xRelative=dim[0];
   yRelative=dim[1];
   widthRelative=dim[2];
   heightRelative=dim[3];
}
 public int[] getDim()
 {
    int dim[]= new int[4];
   dim[0]=xRelative;
   dim[1]=yRelative;
   dim[2]=widthRelative;
   dim[3]=heightRelative;
return dim;  
}   

}
