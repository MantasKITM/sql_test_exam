package com.company;

public class User {
    private String firstname;
    private String lastname;
    private String passwd;
    private String email;
    private int groupId;

    public User(String firstname, String lastname, String passwd, String email, int groupId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.passwd = passwd;
        this.email = email;
        this.groupId = groupId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
