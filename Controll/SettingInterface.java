/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

/**
 *
 * @author mahan
 */
public interface SettingInterface {

    void dimupdateSetting();
    void dimScomboReSelect(int dimSelectedIndex , int activeDimState);
    public void dimSadd(int selectedDimsListIndex , int selectedDim);

    public void dimLess(int selectedDimsListIndex);
    
}
