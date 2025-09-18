package com.champlain.oop2a1;

import java.time.LocalDate;

public class Person {

    private final String aName;
    private final LocalDate aDOB;
    private final String aEmailAddress;
    private boolean aHasParkingPass;

    public Person(String pName, LocalDate pDOB, String pEmailAddress) {
        if (pName == null || pName.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        if (pDOB == null || pDOB.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth cannot be null and cannot be in the future");
        }

        if (pEmailAddress == null || !isValidEmail(pEmailAddress)) {
            throw new IllegalArgumentException("The email address cannot be null or empty");
        }

        this.aName = pName.trim();
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

    private boolean isValidEmail(String email) {
        String emailRegex = "^(.+)@(\\S+)$";
        return email.matches(emailRegex);
    }

    public String toString() {
        return "Name: " + aName +
                ", Date of Birth: " + aDOB +
                ", Email: " + aEmailAddress;
    }
}