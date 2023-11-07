package org.example;

import java.util.ArrayList;
import java.util.List;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {



        List<Integer> lista = new ArrayList<>();

        lista.add(1);

        List<Character> listc = CharacterRepository.CharactersInEpisode(EpisodeService.findClosestFromCoord(0,0,EpisodeRepository.findMatchingEpisodes(lista)).episode);

        for (Character a: listc
             ) {
            System.out.println(a.getName() + " "+ "ID nº: " + a.getCharID());
        }



        }






    }
