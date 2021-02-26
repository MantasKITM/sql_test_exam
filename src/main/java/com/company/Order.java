package com.company;

public class Order {
    private int userId;
    private String category;
    private int groupId;
    private int value;

    public Order(int userId, String category, int groupId, int value) {
        this.userId = userId;
        this.category = category;
        this.groupId = groupId;
        this.value = value;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
