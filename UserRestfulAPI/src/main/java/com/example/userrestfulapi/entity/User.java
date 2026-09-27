package com.example.userrestfulapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fullname", nullable = false,length = 20)
    private String fullname;
    @Column(name = "email" ,nullable = false, length = 50)
    private String email;
    @Column(name = "password", nullable = false, length = 50)
    private String password;
}
