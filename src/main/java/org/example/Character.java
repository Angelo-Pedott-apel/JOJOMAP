package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "Characters")
public class Character {

    @Column(name = "CharID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int charID;
    @Column(name = "Name")
    private String name;
    @Column(name = "Birthday")
    private String birthday;
    @Column(name = "Stand")
    private String stand;
    @Column(name = "IsAlly")
    private boolean isAlly;

    public int getCharID() {
        return charID;
    }

    public void setCharID(int charID) {
        this.charID = charID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public boolean isAlly() {
        return isAlly;
    }

    public void setAlly(boolean ally) {
        isAlly = ally;
    }

    public Character(String name, String birthday, String stand, boolean isAlly) {
        this.name = name;
        this.birthday = birthday;
        this.stand = stand;
        this.isAlly = isAlly;
    }

    public Character(String name, String birthday, boolean isAlly) {
        this.name = name;
        this.birthday = birthday;
        this.isAlly = isAlly;
    }

    public Character(String name, boolean isAlly) {
        this.name = name;
        this.isAlly = isAlly;
    }

    public Character(){}
}
