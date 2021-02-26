package com.company;

public class Main {

    public static void main(String[] args) {
//        CreateDAO crObj = new CreateDAO();
//        crObj.createTables();
        ActionDAO acObj = new ActionDAO();
        acObj.createGroup("Pirma grupe");
        acObj.createGroup("Antra grupe");
        acObj.createGroup("Trecia grupe");

        User user1 = new User("Petras", "Petrauskas", "nuspejamasSlaptazodis", "pp@gmail.com", 1);
        User user2 = new User("Jonas", "Jonaitis", "nenuspejamasSlaptazodis", "jj@gmail.com", 2);

        Order order1 = new Order(1, "Pirma kategorija", 1, 50);

    }
}
