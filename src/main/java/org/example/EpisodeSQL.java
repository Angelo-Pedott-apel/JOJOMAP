package org.example;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "EpisodeList")
public class EpisodeSQL {

    @Column(name="EpisodeID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int episodeID;
    @Column(name="Universe")
    private int universe;
    @Column(name="Part")
    private int part;
    @Column(name="Number")
    private int number;
    @Column(name="Name")
    private String name;
    @Column(name="Location")
    private String location;
    @Column(name="Latitude")
    private BigDecimal latitude;
    @Column(name="Longitude")
    private BigDecimal longitude;

    public int getEpisodeID() {
        return episodeID;
    }

    public void setEpisodeID(int episodeID) {
        this.episodeID = episodeID;
    }

    public int getUniverse() {
        return universe;
    }

    public void setUniverse(int universe) {
        this.universe = universe;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
