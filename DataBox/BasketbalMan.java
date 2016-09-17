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
public class BasketbalMan implements Serializable {

    int nom;
    String name;

    public BasketbalMan() {
        name = "";
    }

    public int getNo() {
        return nom;
    }

    public void setNo(int no) {
        this.nom = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
