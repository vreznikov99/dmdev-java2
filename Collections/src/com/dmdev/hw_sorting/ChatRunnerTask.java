package com.dmdev.hw_sorting;

import com.dmdev.hw_sorting.comparators.ComparatorByUserAmount;

import java.util.*;

/**
 * 1. Дан список чатов. Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * <p>
 * Задача:
 * <p>
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если
 * это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */

public class ChatRunnerTask {
    public static void main(String[] args) {
        User user1 = new User(1, "Jack", "Johnson", 20);
        User user2 = new User(2, "Alice", "Smith", 22);
        User user3 = new User(3, "Bob", "Williams", 19);
        User user4 = new User(4, "Charlie", "Brown", 23);
        User user5 = new User(5, "Diana", "Taylor", 21);
        User user6 = new User(6, "Eve", "Davis", 20);
        User user7 = new User(7, "Frank", "Miller", 24);
        User user8 = new User(8, "Grace", "Wilson", 18);
        User user9 = new User(9, "Hank", "Moore", 25);
        User user10 = new User(10, "Ivy", "Clark", 22);

        List<User> userList1 = Arrays.asList(user1, user2, user4, user7, user10);
        List<User> userList2 = Arrays.asList(user2, user5, user8, user9);
        List<User> userList3 = Arrays.asList(user3, user6, user9);

        Chat chat1 = new Chat("PSG", userList1);
        Chat chat2 = new Chat("Music Lovers", userList2);
        Chat chat3 = new Chat("Java Developers", userList3);
        Chat chat4 = new Chat("Travel Enthusiasts", userList1);
        Chat chat5 = new Chat("Movie Fans", userList3);
        Chat chat6 = new Chat("Foodies", userList2);

        List<Chat> sourceList = Arrays.asList(chat1, chat2, chat3, chat4, chat5, chat6);
        List<Chat> chatList = new ArrayList<>(sourceList);

        ChatUtils.deleteChatsByUsersAmount(chatList);
        List<User> usersFromChats = ChatUtils.allUsersFromChat(chatList);
        System.out.println("Average age of Users: " + ChatUtils.averageUserAge(usersFromChats));
        System.out.println();

        Collections.sort(chatList);  // DEFAULT: sorting by name ( interface Comparable)
        System.out.println("DEFAULT: sorting by name ( interface Comparable)");
        System.out.println(chatList);
        System.out.println();

        chatList.sort(new ComparatorByUserAmount());  // sorted by user amount (interface Comparator)
        System.out.println("sorted by user amount (interface Comparator)");
        System.out.println(chatList);

    }
}
