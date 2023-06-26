package com.example.librarydatabaseassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NewAccounts {
    String firstName;
    String lastName;
    int pinNumber;
    String userName;

    NewAccounts(String firstName, String lastName, int pinNumber, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinNumber = pinNumber;
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public String getUserName() {
        return userName;
    }

}
