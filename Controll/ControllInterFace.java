/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.ControolPack;
import DataBox.LastONAirPack;
import java.awt.Color;

/**
 *
 * @author Shayan
 */
public interface ControllInterFace {

    ControllCommandSet getControllCommandSet();

    ControolPack getControolPack();

    boolean isNewsha();

    void setControllCommandSet(ControllCommandSet controllCommandSet);

    void setControolPack(ControolPack controolPack);

    void setNewsha(boolean newsha);

    void updateControlpack();


}
