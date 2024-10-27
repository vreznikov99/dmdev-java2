package com.dmdev.hw_sorting;

import java.util.*;

public final class ChatUtils {

    private static final int LIMIT_AMOUNT_OF_USERS = 2;
    private ChatUtils() {
    }

    public static List<Chat> deleteChatsByUsersAmount(List<Chat> list){
        ListIterator<Chat> listIterator = list.listIterator();
        List<Chat> listDel = new LinkedList<>();
        while(listIterator.hasNext()){
            Chat next = listIterator.next();
            if (next.amountOfUsers <= LIMIT_AMOUNT_OF_USERS){
                listDel.add(next);
                listIterator.remove();
            }
        }
        System.out.println("Deleted chats: " + listDel);
        return list;
    }

    public static List<User> allUsersFromChat(List<Chat> chatList){
        Map<Integer, User> userMap = new HashMap<>();
        for (Chat chat : chatList) {
            List<User> userList = chat.getUserList();
            for (User user : userList) {
                userMap.put(user.getId(), user);
            }
        }
        return new ArrayList<>(userMap.values());
    }
    public static double averageUserAge(List<User> list){
        double ageSum = 0;
        for (User user : list) {
            ageSum += user.getAge();
        }
        return ageSum / list.size();
    }
}
