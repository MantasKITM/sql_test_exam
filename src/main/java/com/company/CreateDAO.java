package com.company;

import java.sql.*;

public class CreateDAO {

    private final String URL = "jdbc:mysql://localhost:3306/finance_club";
    private final String user = "root";
    private final String passwd = "";
    private Connection conn;
    private Statement stmt;
    private PreparedStatement prstmt;
    private String SQL;

    public void createTables() {
        try {
            conn = DriverManager.getConnection(URL, user, passwd);
            stmt = conn.createStatement();
            SQL = "CREATE TABLE IF NOT EXISTS groups (group_id INT PRIMARY KEY AUTO_INCREMENT, name TEXT)";
            stmt.execute(SQL);
            System.out.println("Lentelė GROUPS sukurta sėkmingai...");

            SQL = "CREATE TABLE IF NOT EXISTS users (user_id INT PRIMARY KEY AUTO_INCREMENT, firstname TEXT, lastname TEXT," +
                    "password TEXT, email TEXT, group_id INT, FOREIGN KEY (group_id) REFERENCES groups(group_id))";
            stmt.execute(SQL);
            System.out.println("Lentelė USERS sukurta sėkmingai...");

            SQL = "CREATE TABLE IF NOT EXISTS orders (order_id INT PRIMARY KEY AUTO_INCREMENT, date DATE, user_id INT, category INT, value INT" +
                    " group_id INT, FOREIGN KEY (user_id) REFERENCES users(user_id), FOREIGN KEY (group_id) REFERENCES groups(group_id))";
            stmt.execute(SQL);

            System.out.println("Lentelė ORDERS sukurta sėkmingai...");

            stmt.close();
            conn.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }




}
