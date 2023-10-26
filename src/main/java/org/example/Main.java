package org.example;

import java.util.ArrayList;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        List<Integer> partList = new ArrayList<>();
        partList.add(1);
        partList.add(2);
        partList.add(3);

        List<Episode> matchingEpisodes = EpisodeRepository.findMatchingEpisodes(partList);

        ClosestEpisode closestEpisode = EpisodeService.findClosestFromCoord(0,0, matchingEpisodes);

        System.out.println(closestEpisode.episode.getEpisodeID()+" - " +closestEpisode.episode.getLocation().trim()+ " - " + closestEpisode.distance);
    }
    }
