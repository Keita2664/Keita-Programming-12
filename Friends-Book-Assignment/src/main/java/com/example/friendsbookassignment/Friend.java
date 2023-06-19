package com.example.friendsbookassignment;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    String name;
    int age;
    String gender;


    Friend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return name;
    }

    public boolean compareNameAgeGender(Friend friend){
        if (this.name.equals(friend.name)&&(this.age==friend.age)&&(this.gender.equals(friend.gender))){
            return true;
        }
        else return false;
    }

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("friend.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\r");
        bw.write(Integer.toString(age) + ".\r");
        bw.write(gender + "/\r");
        bw.write(";\r");
        bw.close();
        FileWriter fw1;
        if (getGender().equals("male")) {
            fw1 = new FileWriter("maleFriend.txt", true);

        } else if (getGender().equals("female")) {
            fw1 = new FileWriter("femaleFriend.txt", true);
        }
        else{ return; }
        BufferedWriter bw1 = new BufferedWriter(fw1);
        bw1.write(name + ",\r");
        bw1.write(Integer.toString(age) + ".\r");
        bw1.write(gender + "/\r");
        bw1.write(";\r");
        bw1.close();
    }
}