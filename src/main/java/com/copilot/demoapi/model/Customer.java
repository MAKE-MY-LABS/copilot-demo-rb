package com.copilot.demoapi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "phone", nullable = false, length = 50)
    private String phone;
}
