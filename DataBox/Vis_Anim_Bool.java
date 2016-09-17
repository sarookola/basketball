/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import java.io.Serializable;

/**
 *
 * @author Shayan
 */
public class Vis_Anim_Bool implements Serializable {

    boolean objectanim;
    int motionDimIndex;
    boolean imagePlay;
    boolean itemsImagVisible;
    boolean itemsTextVisible;

    public Vis_Anim_Bool() {
    }

    public void setObjectanim(boolean objectanim) {
        this.objectanim = objectanim;
    }

    public void setMotionDimIndex(int motionDimIndex) {
        this.motionDimIndex = motionDimIndex;
    }

    public void setImagePlay(boolean imagePlay) {
        this.imagePlay = imagePlay;
    }

    public void setItemsImagVisible(boolean itemsImagVisible) {
        this.itemsImagVisible = itemsImagVisible;
    }

    public void setItemsTextVisible(boolean itemsTextVisible) {
        this.itemsTextVisible = itemsTextVisible;
    }

    public boolean isObjectanim() {
        return objectanim;
    }

    public int getMotionDimIndex() {
        return motionDimIndex;
    }

    public boolean isImagePlay() {
        return imagePlay;
    }

    public boolean isItemsImagVisible() {
        return itemsImagVisible;
    }

    public boolean isItemsTextVisible() {
        return itemsTextVisible;
    }



}
