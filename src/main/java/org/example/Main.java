package org.example;

import static spark.Spark.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        get("/Request", (request, response) -> new RequestQuery(request).responseJSON());

    }
}