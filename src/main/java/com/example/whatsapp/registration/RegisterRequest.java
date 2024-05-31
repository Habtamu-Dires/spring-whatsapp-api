package com.example.whatsapp.registration;

import lombok.Builder;


@Builder
public record RegisterRequest(
         String firstName,
         String lastName,
         String username,
         String password,
         String phoneNumber
) {

}