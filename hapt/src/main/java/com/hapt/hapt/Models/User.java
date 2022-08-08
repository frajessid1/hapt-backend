package com.hapt.hapt.Models;

import javax.persistence.*;
import java.util.Date;

@Entity // tableau
@Table(schema = "hapt_schema")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(unique = false,nullable = false,length = 50)
    private String name;
    @Column(unique = false,nullable = false,length = 50)
    private String lastName;
    @Column(unique = true,nullable = false,length = 70)
    private String Email;
    @Column(unique = false,nullable = false,length = 150)
    private String password;
    @Column(unique = false,nullable = false,length = 150)
    private String adress;
    @Column(unique = false,nullable = false,length = 50)
    private Date  dN;
    @Column(unique = true,nullable = false,length = 50)
    private String phone;

    public User (){

    }
    public User(long id) {
        this.id = id;
    }

    public User(String name, String lastName, String email, String password, String adress, Date dN, String phone) {
        this.name = name;
        this.lastName = lastName;
        Email = email;
        this.password = password;
        this.adress = adress;
        this.dN = dN;
        this.phone = phone;
    }
}
