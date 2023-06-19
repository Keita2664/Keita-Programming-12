package com.example.friendsbookassignment;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFriend {
    private static String name;
    private static int age;
    private static String gender;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> friends = new ArrayList<>();

    public static ArrayList<Friend> loadAllFriend(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null){
            if (!line.equals(";")){
                friendString += line;
            }
            else {
                System.out.println(friendString);
                parseFriend (friendString);
                friendString = "";
            }
        }
        return friends;
    }
    public static ArrayList<Friend> loadMaleFriend(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null){
            if (!line.equals(";")){
                friendString += line;
            }
            else {
                System.out.println(friendString);
                parseFriend (friendString);
                friendString = "";
            }
        }
        return friends;
    }

    public static ArrayList<Friend> loadFemaleFriend(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String friendString = "";
        while ((line = br.readLine()) != null){
            if (!line.equals(";")){
                friendString += line;
            }
            else {
                System.out.println(friendString);
                parseFriend (friendString);
                friendString = "";
            }
        }
        return friends;
    }
    private static void parseFriend(String string){
        int position = 0;
        String name = "";
        int age = 0;
        String gender = "";
        name=string.substring(0,string.indexOf(","));
        age=Integer.parseInt(string.substring(string.indexOf(",")+1,string.indexOf(".")));
        gender= string.substring(string.indexOf(".") + 1, string.indexOf("/"));
        //for (int i = 0; i < string.length(); i++){
        //  if (string.substring(i,i+1).equals(",")){
        //    position = i;
        //  name = string.substring(0,position);
        //age = Integer.parseInt(string.substring(position + 1));
        //gender = string.substring(age + 1);
        //}
        //}
        //int found=0;
        //for(int i=0; i<friends.size();i++){
        //    if(!friends.get(i).compareNameAgeGender(new Friend(name,age,gender) )) {
        //        found++;
        //    }
        //    else{
        //        found=0;
        //        break;
        //    }
        //}
        //if(found!=0){
        friends.add(new Friend(name, age, gender));
        //}
    }

}

