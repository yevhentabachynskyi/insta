package com.my.insta.payload.request;

import com.my.insta.annotations.PasswordMatches;
import com.my.insta.annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignupRequest {

    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
    @NotEmpty(message = "Please enter your name")
    private String firstname;
    @NotEmpty(message = "Please enter your last name")
    private String lastname;
    @NotEmpty(message = "Please enter your user name")
    private String username;
    @NotEmpty(message = "Please enter your password")
    @Size(min = 6)
    private String password;
    private String confirmPassword;

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
