package com.hapt.hapt.Models;

import javax.persistence.*;

@Entity
@Table(schema = "hapt_schema")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String name;

}
