/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.BasketControllData;
import DataBox.ControolPack;
import DataBox.LastONAirPack;
import DataBox.SettingPack;
import DataBox.Database;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author shayan
 */
public class FileManipulat {

    SettingPack settings;

    public void saveObject(String st, Object obj) {
        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(obj);

        try {
            //write converted json data to a file named "file.json"
            FileOutputStream file = new FileOutputStream(st);
            Writer out = new BufferedWriter(
                    new OutputStreamWriter(file, "UTF8"));
//            FileWriter writer = new FileWriter(st);
            out.write(json);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public SettingPack loadSetting(String st, int objecsArrayLenght) {
        SettingPack settings;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, SettingPack.class);
//                convert the json string back to object

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Here is new json creating ");
            settings = new SettingPack(objecsArrayLenght);
        }
        return settings;
    }

    //   
    public Database loadSetting(String st) {
        Database settings;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));
            settings = gson.fromJson(br, Database.class);
            //convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            settings = new Database();
            System.out.println("Here is new json creating and settings=" + settings);

        }
        return settings;
    }

    public LastONAirPack loadlastONairdata(String lastDataFile) {
        LastONAirPack settings;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(lastDataFile), "UTF8"));
            settings = gson.fromJson(br, LastONAirPack.class);
            //convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            settings = null;

        }
        return settings;
    }

    public BasketControllData loadBasketControllData(String st) {
        BasketControllData obj = null;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));
            obj = gson.fromJson(br, BasketControllData.class);

            //convert the json string back to object
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Quarter Name null");
            obj = new BasketControllData();

        }
        return obj;
    }

    ControolPack loadControlData(String lastontrolDataFile, int objecsArrayLenght , int maxname ) {
        ControolPack obj;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(lastontrolDataFile), "UTF8"));
            obj = gson.fromJson(br, ControolPack.class);
            //convert the json string back to object

        } catch (IOException e) {
            System.out.println("load Control data pack failed");
            obj = new ControolPack(objecsArrayLenght,maxname);

        }
        return obj;
    }

}
