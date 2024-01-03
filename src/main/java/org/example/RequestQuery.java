package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Request;

import java.util.ArrayList;
import java.util.List;

public class RequestQuery {

    public List<Integer> part;

    public double latitude;

    public double longitude;


    public RequestQuery(Request request){
        List<Integer> partList = new ArrayList<>();
        for (int i = 1; i < 7 ; i++) {
            String part = "Part_" + i;
            if (request.queryMap().get(part).value() != null) {
                partList.add(i);
            }
        }

        this.part = partList;

        this.latitude = Double.parseDouble(request.queryMap().get("latitude").value());

        this.longitude = Double.parseDouble(request.queryMap().get("longitude").value());
    }
    public String responseJSON() {

        List<Episode> episodeList = EpisodeRepository.findMatchingEpisodes(this.part);
        ClosestEpisode closestEpisode = EpisodeService.findClosestFromCoord(this.latitude, this.longitude, episodeList);
        ResponseDTO responseDTO= new ResponseDTO(closestEpisode.episode.getName().trim(),
                closestEpisode.episode.getLocation().trim(),
                closestEpisode.episode.getPart(),
                closestEpisode.episode.getNumber(),
                closestEpisode.episode.getLatitude(),
                closestEpisode.episode.getLongitude(),
                this.latitude,
                this.longitude,
                closestEpisode.distance/1000);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(responseDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    }
