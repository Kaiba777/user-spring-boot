package com.example.user.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {

    @Size(min = 5, message = "Username must be atleast 5 charecters long")
    private String username;

    @Email(message = "Invalid Email")
    private String email;

    @Pattern(regexp = "^(?=.*[a-zA-Z]).+$", message = "password must contain alphanumeric characters")
    private String password;

    @Min(18)
    @Max(100)
    private String age;

    @NotBlank(message = "Address is required")
    private String address;

    public User() {}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
