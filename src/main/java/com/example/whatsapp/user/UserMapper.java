package com.example.whatsapp.user;


import com.example.whatsapp.user.dtos.ProfileUpdateDTO;
import com.example.whatsapp.user.dtos.UserDTO;

import java.util.List;

public class UserMapper {

    //user to userDTO
    public static UserDTO userToDTO(User user){
        return UserDTO.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .username(user.getUsername())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }

    public static List<UserDTO> userDTOS (List<User> users){
        return users.stream()
                .map(UserMapper::userToDTO)
                .toList();
    }

    //DTO to user
    public static User DtoToUser(UserDTO userDTO){
       return User.builder()
                .firstName(userDTO.firstName())
                .lastName(userDTO.lastName())
                .username(userDTO.username())
                .phoneNumber(userDTO.phoneNumber())
                .build();
    }

    public static ProfileUpdateDTO userToProfileUpdateDTO(User user) {
        return ProfileUpdateDTO.builder()
                .newUsername(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
