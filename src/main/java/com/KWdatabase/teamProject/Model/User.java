package com.KWdatabase.teamProject.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String id;
    private String pw;
    private String username;
    private int age;
    private String email;
    private String phoneNumber;
    private char sex;
    private int adminAuth;
}