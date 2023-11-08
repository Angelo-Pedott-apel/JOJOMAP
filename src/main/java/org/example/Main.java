package org.example;

import static spark.Spark.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        staticFiles.location("/public");

        redirect.get("/", "/Jojo_page/Jojo_page external css.html");

        get("/Request", (request, response) -> {

        RequestQuery requestQuery1 = new RequestQuery(request);
        return requestQuery1.responseString();
        });
        init();
    }
}