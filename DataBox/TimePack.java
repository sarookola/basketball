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
public class TimePack implements Serializable{
    int min,sec;
    int sec24;

    public TimePack() {
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }


    public int getSec24() {
        return sec24;
    }

    public void setSec24(int sec24) {
        this.sec24 = sec24;
    }
    
    
    
}
