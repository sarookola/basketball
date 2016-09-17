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
public class Pack implements Serializable  {

    int x;  // 0 is setting , 1 is controol , 2 timers
    Object object;

    public Pack(int i, Object o) {
        x = i;
        object = o;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObjectByX() {
        if (x == 0) {
            return (SettingPack) object;
        } else {
            return object;
        }
    }

}
