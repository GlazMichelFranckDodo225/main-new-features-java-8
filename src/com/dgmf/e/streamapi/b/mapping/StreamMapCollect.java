package com.dgmf.e.streamapi.b.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollect {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(
                1,
                "John Doe",
                "secrete",
                "johndoe@gmail.com")
        );
        users.add(new User(
                2,
                "Flagherty Gomis",
                "secrete",
                "flaghertygomis@gmail.com")
        );
        users.add(new User(
                3,
                "Adebayor Kobenan",
                "secrete",
                "adebayorkobenan@gmail.com")
        );

        // Converting Users to UserDtos Using the "map()"
        // Method of the Stream API
        List<UserDto> userDtos = users.stream()
                .map((User user) -> new UserDto(
                                user.getId(),
                                user.getUserName(),
                                user.getEmail()
                        )
                )
                // .forEach(System.out::println); ==> Without Storage
                .collect(Collectors.toList()); // ==> With Storage

        userDtos.forEach(System.out::println);
    }
}
