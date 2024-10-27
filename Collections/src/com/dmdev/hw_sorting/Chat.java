package com.dmdev.hw_sorting;

import java.util.List;

public class Chat implements Comparable<Chat>{
    String name;
    int amountOfUsers;
    List<User> userList;

    public Chat(String name, int amountOfUsers) {
        this.name = name;
        this.amountOfUsers = amountOfUsers;
    }

    public Chat(String name, List<User> userList) {
        this.name = name;
        this.amountOfUsers = userList.size();
        this.userList = userList;
    }

    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.getName());
    }

    public List<User> getUserList() {
        return userList;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", amountOfUsers=" + amountOfUsers +
                '}';
    }
}
