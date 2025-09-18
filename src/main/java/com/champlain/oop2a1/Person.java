package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {
    private final String aName;
    private final LocalDate aDOB;
    private final String aEmailAddress;
    private boolean aHasParkingPass;

    public Person(String pName, LocalDate pDOB, String pEmailAddress) {
        this.aName = pName;
        this.aDOB = pDOB;
        this.aEmailAddress = pEmailAddress;
        this.aHasParkingPass = false;
    }

    public String getName() {
        return aName;
    }

    public LocalDate getDOB() {
        return aDOB;
    }

    public String getEmailAddress() {
        return aEmailAddress;
    }

    public boolean isPurchasedParkingPass() {
        return aHasParkingPass;
    }

    public boolean purchaseParkingPass() {
        if (this.aHasParkingPass) {
            return false;
        }
        else{
            this.aHasParkingPass = true;
            return true;
        }

    }
}