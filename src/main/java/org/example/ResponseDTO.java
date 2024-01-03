package org.example;

import com.microsoft.sqlserver.jdbc.SQLServerResource_zh_TW;

public class ResponseDTO {

    private String episodeName;

    private String episodeLocation;

    private int episodePart;

    private int episodeNumber;

    private double episodeLatitude;

    private double episodeLongitude;

    private double queryLatitude;

    private double queryLongitude;

    private double distance;

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getEpisodeLocation() {
        return episodeLocation;
    }

    public void setEpisodeLocation(String episodeLocation) {
        this.episodeLocation = episodeLocation;
    }

    public int getEpisodePart() {
        return episodePart;
    }

    public void setEpisodePart(int episodePart) {
        this.episodePart = episodePart;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public double getEpisodeLatitude() {
        return episodeLatitude;
    }

    public void setEpisodeLatitude(double episodeLatitude) {
        this.episodeLatitude = episodeLatitude;
    }

    public double getEpisodeLongitude() {
        return episodeLongitude;
    }

    public void setEpisodeLongitude(double episodeLongitude) {
        this.episodeLongitude = episodeLongitude;
    }

    public double getQueryLatitude() {
        return queryLatitude;
    }

    public void setQueryLatitude(double queryLatitude) {
        this.queryLatitude = queryLatitude;
    }

    public double getQueryLongitude() {
        return queryLongitude;
    }

    public void setQueryLongitude(double queryLongitude) {
        this.queryLongitude = queryLongitude;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public ResponseDTO(String episodeName, String episodeLocation, int episodePart, int episodeNumber, double episodeLatitude, double episodeLongitude, double queryLatitude, double queryLongitude, double distance) {
        setEpisodeName(episodeName);
        setEpisodeLocation(episodeLocation);
        setEpisodePart(episodePart);
        setEpisodeNumber(episodeNumber);
        setEpisodeLatitude(episodeLatitude);
        setEpisodeLongitude(episodeLongitude);
        setQueryLatitude(queryLatitude);
        setQueryLongitude(queryLongitude);
        setDistance(distance);
    }
}
