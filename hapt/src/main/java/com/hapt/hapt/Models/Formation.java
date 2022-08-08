package com.hapt.hapt.Models;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "hapt_schema")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(nullable = false,unique = false,length = 150)
    private String name;
    @Column(nullable = false,unique = false,length = 150)
    private int nbreParticipants;
    @Column(nullable = false,unique = false,length = 150)
    private String type;

    @ManyToMany(mappedBy = "formationList")
    private List<Entreprise> entrepriseList;

    public Formation(String name, int nbreParticipants, String type) {
        this.name = name;
        this.nbreParticipants = nbreParticipants;
        this.type = type;
    }

    public Formation(long id) {
        this.id = id;
    }
    public Formation(){

    }

    public List<Entreprise> getEntrepriseList() {
        return entrepriseList;
    }

    public void setEntrepriseList(List<Entreprise> entrepriseList) {
        this.entrepriseList = entrepriseList;
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

    public int getNbreParticipants() {
        return nbreParticipants;
    }

    public void setNbreParticipants(int nbreParticipants) {
        this.nbreParticipants = nbreParticipants;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
