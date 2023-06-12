package org.example;

import java.sql.*;

public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection connection = null;
    private static Statement statement = null;

    public DatabaseHandler(){
        createConnection();
        createTable();
    }

    private void createTable() {
        String TABLE_NAME = "FILES";
        try {
            statement = connection.createStatement();
            DatabaseMetaData dmn = connection.getMetaData();
            ResultSet tables = dmn.getTables(null,null,TABLE_NAME,null);
            if (tables.next()){
                System.out.println("Table" + TABLE_NAME + " exists");
            }
            else {
                String apacheStatement = "CREATE TABLE " + TABLE_NAME + "("
                        +"fileName varchar(200) primary key,\n"
                        +"filePath varchar(200), \n"
                        +"extension varchar(200), \n"
                        +"sizeInBytes varchar(200))";
                System.out.println(apacheStatement);
                statement.execute(apacheStatement);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void createConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            connection = DriverManager.getConnection(DB_url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    //Start from here
    //watch video from 21:41
    public boolean execAction(String qu){
        try {
            statement = connection.createStatement();
            statement.execute(qu);
            return true;
        } catch (SQLException throwables) {
            System.out.println(throwables);
            System.out.println("Did not Enter data");
        }
        return false;
    }

    public ResultSet execQuery(String query){
        ResultSet resultSet;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        return resultSet;
    }
}
