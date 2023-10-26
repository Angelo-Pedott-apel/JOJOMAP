package org.example;

import net.sf.geographiclib.Geodesic;
import net.sf.geographiclib.GeodesicMask;

import java.util.List;

public class EpisodeService {

    public static ClosestEpisode findClosestFromCoord(double latitude, double longitude, List<Episode> episodelist){

        double minDistance = getDistance(latitude, longitude, episodelist.get(0));
        ClosestEpisode closestEp = new ClosestEpisode(episodelist.get(0), minDistance);

        for (Episode i : episodelist){
            double newDistance = getDistance(latitude, longitude, i);
            if (newDistance < minDistance){
                minDistance = newDistance;
                closestEp = new ClosestEpisode(i,minDistance);
            }
        }
        return  closestEp;
    }

    private static double getDistance(double latitude, double longitude, Episode episodelist) {
        return Geodesic.WGS84.Inverse(latitude, longitude, episodelist.getLatitude(), episodelist.getLongitude(), GeodesicMask.DISTANCE).s12;
    }

}
