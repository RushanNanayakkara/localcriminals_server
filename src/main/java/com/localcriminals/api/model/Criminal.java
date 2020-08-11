package com.localcriminals.api.model;

import com.localcriminals.api.model.enums.*;

import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "Criminal")
public class Criminal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name="firstName")
    public String firstName;

    @Column(name="lastName")
    public String lastName;

    @Column(name="age")
    public int age;

    @Column(name="activeArea")
    public String activeArea;

    @Column(name="wantedLevel")
    public WantedLevel wantedLevel;

    public Criminal() {
    }

    public Criminal(String firstName, String lastName, int age, String activeArea, WantedLevel wantedLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.activeArea = activeArea;
        this.wantedLevel = wantedLevel;
    }

    public Criminal(int id, String firstName, String lastName, int age, String activeArea, WantedLevel wantedLevel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.activeArea = activeArea;
        this.wantedLevel = wantedLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getActiveArea() {
        return activeArea;
    }

    public void setActiveArea(String activeArea) {
        this.activeArea = activeArea;
    }

    public WantedLevel getWantedLevel() {
        return wantedLevel;
    }

    public void setWantedLevel(WantedLevel wantedLevel) {
        this.wantedLevel = wantedLevel;
    }
}
