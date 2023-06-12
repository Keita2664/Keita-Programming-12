package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static DatabaseHandler handler;
    public static void addFile(String fileName, String filePath, String extension, String sizeInBytes){
        String qu = "INSERT INTO FILES VALUES (" +
                "'" + fileName + "'," +
                "'" + filePath + "'," +
                "'" + extension + "'," +
                "'" + sizeInBytes + "')";
        handler.execAction(qu);
    }

    public static void main(String[] args) {
        handler = new DatabaseHandler();
        
        addFile("photo","C:\\Users\\kojim\\Documents\\photo", "JPEG","3200");
        addFile("script","C:\\Users\\kojim\\Documents\\script","word", "33200");
        addFile("presentation","C:\\Users\\kojim\\Documents\\presentation", "ppt","123563");

        String qu = "SELECT * FROM FILES WHERE EXTENSION = 'ppt'";
        ResultSet resultSet = handler.execQuery(qu);
        try {
            while (resultSet.next()){
                String name = resultSet.getString("FILENAME");
                String path = resultSet.getString("FILEPATH");
                String extension = resultSet.getString("EXTENSION");
                String size = resultSet.getString("SIZEINBYTES");

                System.out.println("Entry: Name" + name + "\tPath: " + path +"\nExtension: " + extension + "\tSize: " + size);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}