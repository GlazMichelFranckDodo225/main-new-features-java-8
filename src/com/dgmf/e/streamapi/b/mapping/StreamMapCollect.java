package com.dgmf.e.streamapi.b.mapping;

import java.util.ArrayList;
import java.util.List;

public class StreamMapCollect {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<UserDto> userDtos = new ArrayList<>();

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

        // Conversion of Users to UserDtos without the
        // "map()" Method of the Stream API
        for(User user: users) {
            UserDto userDto = new UserDto(
                    user.getId(), user.getUserName(), user.getEmail()
            );
            userDtos.add(userDto);
        }

        // Outputs
        for(UserDto userDto: userDtos) {
            System.out.println(userDto);
        }
    }
}
