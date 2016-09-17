/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import Comunicate.Server;
import DataBox.ControolPack;
import DataBox.Pack;
import base.DisplayInterface;

/**
 *
 * @author shayan
 */
public class ControllCommandSet {

    ControolPack controolPack;
    private final Server server;
//    DisplayInterface out[];

    public ControllCommandSet(Server server) {
        this.server = server;
    }

    public ControolPack getControolPack() {
        return controolPack;
    }

    public void setControolPack(ControolPack controolPack) {
        this.controolPack = controolPack;

    }

    void smallscorein(boolean flagsOn) {

        controolPack.setItemsImagVisible(36, false);
        controolPack.setItemsImagVisible(37, false);
        controolPack.setItemsImagVisible(39, false);
//            controolPack.setimagePlay(38, true);
        controolPack.setItemsImagVisible(38, true);

//        controolPack.setItemsImagVisible(49, false);
//        controolPack.setItemsImagVisible(50, false);
//        switch (controolPack.getHalf()) {
//            case 1:
//                controolPack.setItemsImagVisible(49, true);
//                break;
//            case 2:
//                controolPack.setItemsImagVisible(50, true);
//                break;
//            default:
//                break;
//        }
        int imagevis[] = {55, 56, 41};
        int textvis[] = {42, 43, 44, 45, 46, 47, 48, 51};
        int imagePlay[] = {36, 37, 38, 39, 55, 56};
        int objectanim[] = {30, 31, 32, 33, 34, 35, 36, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
        setVisNo(imagevis, textvis, imagePlay, objectanim, true);
        if (!flagsOn) {
            controolPack.setItemsImagVisible(55, false);
            controolPack.setItemsImagVisible(56, false);
        }

        updatecontroolPack(controolPack);

        setobjectanimoff(objectanim, imagePlay);
    }

    private void setVisNo(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, boolean bol) {
        for (int p : imagevis) {
            controolPack.setItemsImagVisible(p, bol);
        }
        for (int p : textvis) {
            controolPack.setItemsTextVisible(p, bol);
        }
        for (int p : imagePlay) {
            controolPack.setimagePlay(p, bol);
        }
        for (int p : objectanim) {
            controolPack.setObjectanim(p, 0, bol);               //zxdgxzdffdsfzdszg
        }
    }

    private void setVisMothion(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, int[] motionDims, boolean bol) {
        for (int p : imagevis) {
            controolPack.setItemsImagVisible(p, bol);
        }
        for (int p : textvis) {
            controolPack.setItemsTextVisible(p, bol);
        }
        for (int p : imagePlay) {
            controolPack.setimagePlay(p, bol);
        }

        for (int i = 0; i < objectanim.length; i++) {

            controolPack.setObjectanim(objectanim[i], motionDims[i], bol);
//             controolPack.setObjectanim(20, 1, bol);
        }
    }

    private void setobjectanimoff(int[] objectanim, int[] Imageanim) {
        for (int p : objectanim) {
            controolPack.setObjectanim(p, 0, false);
        }
        for (int p : Imageanim) {
            controolPack.setimagePlay(p, false);
        }
    }

    private void updatecontroolPack(ControolPack controolPack) {
        server.writeSocket(new Pack(1, controolPack));

    }

    void Linescore_show() {
        int imagevis[] = {50, 51, 52, 54, 56, 58, 99, 62, 63, 64, 67, 68, 69};
        int textvis[] = {60, 65, 82, 84, 85, 86, 88};
        int imagePlay[] = {};
        int objectanim[] = {50, 51, 57, 59, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 52, 54, 56, 58, 60, 65, 82, 84, 85, 86, 88, 89, 99, 62, 63, 64, 67, 68, 69};
        int motionDims[] = {01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01, 01};
//         int objectanim[] = {};
//        int motionDims[] = {};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
//        System.out.println("control time in command"+controolPack.getTimePack().getSec24());
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
        int imagevis1[] = {62, 63, 64, 67, 68, 69};
        int textvis1[] = {};
        int imagePlay1[] = {};
        int objectanim1[] = {};
        setVisNo(imagevis1, textvis1, imagePlay1, objectanim1, false);

    }

    void Linescore_Hide() {
        int imagevis[] = {50, 51, 52, 54, 56, 58, 99};
        int textvis[] = {60, 65, 82, 84, 85, 86, 88};
        int imagePlay[] = {};
        int objectanim[] = {50, 51, 57, 59, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 52, 54, 56, 58, 60, 65, 82, 84, 85, 86, 88, 89, 99, 62, 63, 64, 67, 68, 69};
        int motionDims[] = {02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02, 02};
//         int objectanim[] = {};
//        int motionDims[] = {};
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
//       
//            controolPack.setItemsImagVisible(36, false);
//            controolPack.setItemsImagVisible(37, false);
//            controolPack.setItemsImagVisible(38, false);
//            controolPack.setimagePlay(39, true);
//            controolPack.setItemsImagVisible(39, true);

        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void errorHide() {
        int imagevis[] = {70, 71, 72, 73, 74, 75, 76, 77, 78, 79};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void errorShow(int foulTop, int foulBot) {
        int imagevis[] = {70, 71, 72, 73, 74, 75, 76, 77, 78, 79};
        int textvis[] = {};
        int imagePlay[] = {};
        int objectanim[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
        controolPack.setItemsImagVisible(51, true);
        switch (foulTop) {
            case 5:
                controolPack.setItemsImagVisible(74, true);
            case 4:
                controolPack.setItemsImagVisible(73, true);
            case 3:
                controolPack.setItemsImagVisible(72, true);
            case 2:
                controolPack.setItemsImagVisible(71, true);
            case 1:
                controolPack.setItemsImagVisible(70, true);
                break;

        }
        switch (foulBot) {
            case 5:
                controolPack.setItemsImagVisible(79, true);
            case 4:
                controolPack.setItemsImagVisible(78, true);
            case 3:
                controolPack.setItemsImagVisible(77, true);
            case 2:
                controolPack.setItemsImagVisible(76, true);
            case 1:
                controolPack.setItemsImagVisible(75, true);
                break;

        }

    }

    void timersCoverShow() {
        controolPack.setItemsImagVisible(89, true);
    }

    void timersCoverHide() {
        controolPack.setItemsImagVisible(89, false);
    }

    void teamNameShow(boolean teamA, boolean teamB) {
        controolPack.setItemsTextVisible(57, teamA);
        controolPack.setItemsTextVisible(59, teamB);

    }

    void testShow() {
        int imagevis[] = {20};
        int textvis[] = {21};
        int imagePlay[] = {};
        int objectanim[] = {20, 21};
        int motionDims[] = {1, 1};
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
//       
//            controolPack.setItemsImagVisible(36, false);
//            controolPack.setItemsImagVisible(37, false);
//            controolPack.setItemsImagVisible(38, false);
//            controolPack.setimagePlay(39, true);
//            controolPack.setItemsImagVisible(39, true);

        updatecontroolPack(controolPack);

        setobjectanimoff(objectanim, imagePlay);
    }

    void testHide() {
        int imagevis[] = {20};
        int textvis[] = {21};
        int imagePlay[] = {};
        int objectanim[] = {20, 21};
        int motionDims[] = {2, 2};
//         int objectanim[] = {};
//        int motionDims[] = {};
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
//       
//            controolPack.setItemsImagVisible(36, false);
//            controolPack.setItemsImagVisible(37, false);
//            controolPack.setItemsImagVisible(38, false);
//            controolPack.setimagePlay(39, true);
//            controolPack.setItemsImagVisible(39, true);

        updatecontroolPack(controolPack);
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);

    }

    void showIntroOn() {
        int imagevis[] = {120, 124, 125};
        int textvis[] = {121, 122, 123, 126, 127, 128, 129};
        int imagePlay[] = {};
        int objectanim[] = {120, 121, 122, 123, 124, 125, 126, 127, 128, 129};
        int motionDims[] = {001, 001, 001, 001, 001, 001, 001, 001, 001, 001};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
//       
//            controolPack.setItemsImagVisible(36, false);
//            controolPack.setItemsImagVisible(37, false);
//            controolPack.setItemsImagVisible(38, false);
//            controolPack.setimagePlay(39, true);
//            controolPack.setItemsImagVisible(39, true);

        updatecontroolPack(controolPack);

        setobjectanimoff(objectanim, imagePlay);
    }

    void showIntrooff() {
        int imagevis[] = {120, 124, 125};
        int textvis[] = {121, 122, 123, 126, 127, 128, 129};
        int imagePlay[] = {};
        int objectanim[] = {120, 121, 122, 123, 124, 125, 126, 127, 128, 129};
        int motionDims[] = {002, 002, 002, 002, 002, 002, 002, 002, 002, 002};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, false);
    }

    void showTeamon() {
        int imagevis[] = {135, 136};
        int textvis[] = {137, 138, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 170, 171};
        int imagePlay[] = {};
        int objectanim[] = {135, 136, 137, 138, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 170, 171};
        int motionDims[] = {001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
    }

    void showTeamoff() {
        int imagevis[] = {135, 136};
        int textvis[] = {137, 138, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 170, 171};
        int imagePlay[] = {};
        int objectanim[] = {135, 136, 137, 138, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 170, 171};
        int motionDims[] = {002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, false);
    }

    void showRefreOn() {
        int imagevis[] = {175};
        int textvis[] = {176, 177, 178};
        int imagePlay[] = {};
        int objectanim[] = {175, 176, 177, 178};
        int motionDims[] = {1, 1, 1, 1};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void showRefreOff() {
        int imagevis[] = {175};
        int textvis[] = {176, 177, 178};
        int imagePlay[] = {};
        int objectanim[] = {175, 176, 177, 178};
        int motionDims[] = {2, 2, 2, 2};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, false);
    }

    void teamPointAddA(int i) {
        int imagevis[] = {61 + i};
        int textvis[] = {61};
        int imagePlay[] = {61 + i};
        int objectanim[] = {60, 61};
        int motionDims[] = {4, 4};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, false);
    }

    void teamPointAddB(int i) {
        int imagevis[] = {66 + i};
        int textvis[] = {66};
        int imagePlay[] = {66 + i};
        int objectanim[] = {65, 66};
        int motionDims[] = {4, 4};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

}
