package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "EpisodeList")
public class Episode {

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
    private double latitude;
    @Column(name="Longitude")
    private double longitude;

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        if  (90<latitude || latitude<-90) {
            throw new IllegalArgumentException("Latitude out of range");
        }
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        if (180<longitude || longitude<-180){
            throw new IllegalArgumentException("Longitude out of range");
        }
        this.longitude = longitude;
    }
}
