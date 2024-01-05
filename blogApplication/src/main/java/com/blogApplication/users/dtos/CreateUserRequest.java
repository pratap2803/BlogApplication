package com.blogApplication.users.dtos;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data // this is used for getters and setters
@Setter(AccessLevel.NONE) // this prevent the members to updating
public class CreateUserRequest {
    @NonNull
    private String username;
    @NonNull
    private String pasword;
    @NonNull
    private String email;
}
