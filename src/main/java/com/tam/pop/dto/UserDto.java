package com.tam.pop.dto;

import org.jetbrains.annotations.NotNull;

public class UserDto {
        @NotNull
//        @NotEmpty
        private String firstName;

        @NotNull
//        @NotEmpty
        private String lastName;

        @NotNull
//        @NotEmpty
        private String password;
        private String matchingPassword;

        @NotNull
//        @NotEmpty
        private String email;

        // standard getters and setters

}
