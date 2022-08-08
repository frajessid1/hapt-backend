package com.hapt.hapt.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "hapt_schema")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(nullable = false,unique = true,length = 150)
    private String name;
    @Column(nullable = false,unique = false,length = 150)
    private String matriculeFiscale;
    @Column(nullable = false,unique = false,length = 150)
    private String address;
    @Column(nullable = false,unique = false,length = 150)
    private String activity;
    @Column(nullable = false,unique = false,length = 150)
    private int nbreEmployes;
    @Column(name = "email", nullable = false, unique = true)
    private static String email;
    @Column(nullable = false,unique = false,length = 150)
    private String password;
    @ManyToMany
    @JoinTable(name = "user_formation",
            joinColumns={@JoinColumn(name = "entreprise",referencedColumnName = "id",nullable = false)},
            inverseJoinColumns={@JoinColumn(name = "formation",referencedColumnName = "id",nullable = false)})
    private List<Formation> formationList;


    public Entreprise() {

    }
    public Entreprise(long id) {
        this.id = id;
    }

    public Entreprise(String name, String matriculeFiscale, String address, String activity, int nbreEmployes, String email, String password) {
        this.name = name;
        this.matriculeFiscale = matriculeFiscale;
        this.address = address;
        this.activity = activity;
        this.nbreEmployes = nbreEmployes;
        this.email = email;
        this.password = password;
    }

    public List<Formation> getFormationList() {
        return formationList;
    }

    public void setFormationList(List<Formation> formationList) {
        this.formationList = formationList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getNbreEmployes() {
        return nbreEmployes;
    }

    public void setNbreEmployes(int nbreEmployes) {
        this.nbreEmployes = nbreEmployes;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Entreprise.email = email;
    }

    public String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        password = password;
    }
}
