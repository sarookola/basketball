/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import DataBox.SettingPack;
import DataBox.ControolPack;
import DataBox.TimePack;

/**
 *
 * @author mahan
 */
public interface DisplayInterface {

    //
    // Variables declaration - do not modify
    // End of variables declaration
    void updateSetting(SettingPack settings);

    void updatecontroolPack(ControolPack controolPack);

    int getobjecsArrayLenght();

    void setVisible(boolean visiblity);

    void setPanelName(String name);

    String getFrameName();

    public void setPreview(boolean preview);

    public void Updatetime(TimePack timepack);

}
