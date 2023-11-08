package org.example;

import spark.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestQuery {

    public List<Integer> part;

    public double latitude;

    public double longitude;

    public RequestQuery(List<Integer> partlist, double latitude, double longitude) {
        this.part = partlist;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public RequestQuery(Request request){
        List<Integer> partList = new ArrayList<>();
        for (int i = 1; i < 7 ; i++) {
            String part = "Part_" + i;
            if (request.queryMap().get(part).value() != null) {
                partList.add(Integer.valueOf(i));
            }
        }

        this.part = partList;

        this.latitude = Double.valueOf(request.queryMap().get("latitude").value());

        this.longitude = Double.valueOf(request.queryMap().get("longitude").value());
    }

    public String responseString(){

        List<Episode> episodeList = EpisodeRepository.findMatchingEpisodes(this.part);

        ClosestEpisode closestEpisode = EpisodeService.findClosestFromCoord(this.latitude, this.longitude, episodeList);
        System.out.println(closestEpisode.distance);
        String reponse =
                String.format("%s(Part: %d, Episode: %d) is the closest episode from the coordinates %s latitude and %s longitude. \n" +
                                " This episode is in %s. The distance from the location and %s is %s Km."
                , closestEpisode.episode.getName()
                , closestEpisode.episode.getPart()
                , closestEpisode.episode.getNumber()
                , this.latitude
                , this.longitude
                , closestEpisode.episode.getLocation()
                , closestEpisode.episode.getLocation()
                , closestEpisode.distance/1000);


        return reponse;
    }

 }
