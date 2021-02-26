package com.company;

import java.sql.*;

public class ActionDAO {

    private final String URL = "jdbc:mysql://localhost:3306/finance_club";
    private final String login = "root";
    private final String passwd = "";
    private Connection conn;
    private Statement stmt;
    private PreparedStatement prstmt;
    private String SQL;

    public void insertOrder (Order order) {
        try {
            conn = DriverManager.getConnection(URL, login, passwd);
            SQL = "INSERT INTO orders (user_id, category, group_id, value) VALUES (?,?,?,?)";
            prstmt = conn.prepareStatement(SQL);
            prstmt.setInt(1, order.getUserId());
            prstmt.setString(2, order.getCategory());
            prstmt.setInt(3, order.getGroupId());
            prstmt.setInt(4, order.getValue());

            prstmt.execute();
            System.out.println("Atsiskaitymas išsaugotas");

            stmt.close();
            conn.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertUser(User user) {
        try {
            conn = DriverManager.getConnection(URL, login, passwd);
            SQL = "INSERT INTO users (firstname, lastname, password, email, group_id) VALUES (?,?,?,?,?)";
            prstmt = conn.prepareStatement(SQL);
            prstmt.setString(1, user.getFirstname());
            prstmt.setString(2, user.getLastname());
            prstmt.setString(3, user.getPasswd());
            prstmt.setString(4, user.getEmail());
            prstmt.setInt(5, user.getGroupId());

            prstmt.execute();
            System.out.println("Atsiskaitymas išsaugotas");

            stmt.close();
            conn.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void createGroup(String groupName) {
        try {
            conn = DriverManager.getConnection(URL, login, passwd);
            SQL = "INSERT INTO groups (groupname) VALUES (?)";
            prstmt = conn.prepareStatement(SQL);
            prstmt.setString(1, groupName);

            prstmt.execute();
            System.out.println("Atsiskaitymas išsaugotas");

            stmt.close();
            conn.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void displayEntriesByDate() {

    }

    public void displayEntriesByGroup() {

    }
    
}
