package org.example;

public class Episode {

    private String name;

    private double latitude;

    private double longitude;

    public Episode(String name, double latitude, double longitude) {
        this.setName(name);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
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
