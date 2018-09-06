package com.qa.application.cinemaapp.controller;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.qa.application.cinemaapp.constants.Constants;
import com.qa.application.cinemaapp.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


@RestController
public class MovieDataController {


    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

   @Autowired
   private Gson gson;

    @RequestMapping("getUpAndComingImagePaths")
    public List<String> getUpAndComingMoviesImagePaths() throws IOException {
        BufferedReader in;
        StringBuffer response = null;

        try {
            String upAndComingUrl = Constants.MOVIEUPANDCOMINGREQUEST;

            URL obj = new URL(upAndComingUrl);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            log.info("\nSending Get Request to URL:" + upAndComingUrl);
            log.info("Response COde:" + responseCode);

            in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;

            response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info(response.toString());

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject) parser.parse(response.toString());

        JsonArray jsonArray = (JsonArray) jsonObject.get("results");

            String returnUrl = "";
            List<String> pathList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {

            JsonObject movieObj = (JsonObject) jsonArray.get(i);
            String pathString = movieObj.get("poster_path").toString();
            String quotesRemovedString = pathString.replaceAll("^\"|\"$", "");
            returnUrl = Constants.IMAGEPATHREQUEST + quotesRemovedString;
            pathList.add(returnUrl);
        }
        return pathList;
    }

    @RequestMapping("movie/search/{movieTitle}")
    public String getSearchMovie(@PathVariable String movieTitle){

        log.info("getting movie details");

        BufferedReader in;
        StringBuffer response = null;
        //initial search request using web api
        try{
            String searchUrl = Constants.MOVIESEARCHREQUEST+movieTitle;

            URL obj = new URL(searchUrl);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            log.info("\nSending Get Request to URL:" + searchUrl);
            log.info("Response Code:" +responseCode);

            in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;

            response = new StringBuffer();

            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();

        } catch(IOException e){
            e.printStackTrace();
        }
        log.info(response.toString());
        //response from api is a large amount of json data
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject)parser.parse(response.toString());

        JsonArray jsonArray = (JsonArray) jsonObject.get("results");

            JsonObject movieObj = (JsonObject)jsonArray.get(0);

            String idString = movieObj.get("id").toString();
         //convert data into json object and store data in a json array so you can access data via index 0 being the most related search

        BufferedReader backIn;
        StringBuffer finalResponse = null;
        //second request accessing api taking the id from search and then assigning it to the url for movie data can append what is needed this way
        try{
            String returnUrl = "https://api.themoviedb.org/3/movie/"+idString+"?api_key=xxxx";

            URL returnObj = new URL(returnUrl);
            HttpURLConnection connection2 = (HttpURLConnection) returnObj.openConnection();
            connection2.setRequestMethod("GET");
            int responseCode2 = connection2.getResponseCode();
            log.info("\nSending Get Request to URL:" + returnUrl);
            log.info("Response Code:" +responseCode2);

            backIn = new BufferedReader(
                    new InputStreamReader(connection2.getInputStream()));
            String inputLine2;

            finalResponse = new StringBuffer();

            while((inputLine2 = backIn.readLine()) != null){
                finalResponse.append(inputLine2);
            }
            backIn.close();

        } catch(IOException e){
            e.printStackTrace();
        }
        return finalResponse.toString();
        //finalresponse is data from specific movie search can be appended depending on what data is needed

    }






}