package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
    //class variable
    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;

    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;


    //constructor,: A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
    public BaseDisc(int storageCapacityInMB, int spinSpeedInRPM) {

        this.discData = ""; //"instance" of created class variables
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;
        this.storageCapacityInMB = storageCapacityInMB;
        this.spinSpeedInRPM = spinSpeedInRPM;

        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacityInMB));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeedInRPM));
    }

    public BaseDisc(int storageCapacityInMB, int spinSpeedInRPM, String title) {
        this(storageCapacityInMB, spinSpeedInRPM);
        this.discInfo.put("Title", title);
    }


    //Methods
    //Getters and Setters


    public boolean isInserted() {
        return this.isInserted;
    }

    public int getStorageCapacityInMB() {
        return this.storageCapacityInMB;
    }

    public int getSpinSpeedInRPM() {
        return this.spinSpeedInRPM;
    }

    protected void writeData(String data) {
        this.discData += data; //is adding whatever String data entered into empty variable discData
    }

    public String readData() {
        return this.discData;
    }

    public HashMap<String, String> getInfo() {
        return this.discInfo;
    }

    public void insert() {
        this.isInserted = true;
    }
}
