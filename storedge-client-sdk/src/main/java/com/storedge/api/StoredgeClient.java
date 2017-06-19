package main.java.com.storedge.api;

import com.google.gson.Gson;
import main.java.com.storedge.api.interfaces.*;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by rnlintern1 on 6/8/17.
 */
public class StoredgeClient {

    /**
     * Set default http timeout to 10
     */
    private final int DEFAULT_HTTP_TIMEOUT = 10;

    /**
     * String to store facility id
     */
    private  String facility_id;

    /**
     * Api base url
     */
    private final String URL = "https://api.storedgefms.com/docs/v1/";

    /**
     * Consumer for oauth 1.0
     */
    private OAuthConsumer consumer;

    /**
     * Gson to convert and parse JSON data
     */
    private Gson gson;

    /**
     * Initialize facility id, gson, and create signpost consumer
     * @param api_key
     * @param secret
     * @param facility_id
     */
    StoredgeClient(String api_key, String secret, String facility_id) {
        this.facility_id = facility_id;

        consumer = new DefaultOAuthConsumer(api_key, secret);
        gson = new Gson();
    }

    /**
     * Determines which type of http request to make
     * @param method - type of http request. can be: post, patch, put, get, delete
     * @param uri - path to append to base url
     * @param bodyData - data to be sent in body of request
     * @return parsed json data from http request
     * @throws Exception
     */
    protected String forward(String method, String uri, String bodyData) throws Exception {
        String response = "";
        URL url = null;
        try {
            url = new URL(URL + uri);
        } catch (java.net.MalformedURLException e) {
            e.printStackTrace();
        }

        switch (method.toUpperCase()) {
            case "POST":
                response = post(url, bodyData);
                break;
            case "PATCH":
                response = patch(url, bodyData);
                break;
            case "PUT":
                response = put(url, bodyData);
                break;
            case "GET":
                response = get(url);
                break;
            case "DELETE":
                response = delete(url);
                break;
        }

        return response;
    }

    /**
     * Creates post http request and authorizes with consumer
     * @param url - Uses url to create http request
     * @param bodyData - Sends to update to be used in body of http request
     * @return parsed json data from http request
     * @throws Exception
     */
    private String post(URL url, String bodyData) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("POST");
        request.setRequestProperty( "Content-Type", "application/json");
        request.setRequestProperty( "charset", "utf-8");
        request.setConnectTimeout(DEFAULT_HTTP_TIMEOUT);
        request.setDoOutput(true);

        consumer.sign(request);
        request.connect();

        return update(request, bodyData);
    }

    /**
     * Creates put http request and authorizes with consumer
     * @param url - Uses url to create http request
     * @param bodyData - Sends to update to be used in body of http request
     * @return parsed json data from http request
     * @throws Exception
     */
    private String put(URL url, String bodyData) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("PUT");
        request.setRequestProperty( "Content-Type", "application/json");
        request.setRequestProperty( "charset", "utf-8");
        request.setConnectTimeout(DEFAULT_HTTP_TIMEOUT);
        request.setDoOutput(true);

        consumer.sign(request);
        request.connect();

        return update(request, bodyData);
    }

    /**
     * Creates patch http request and authorizes with consumer
     * @param url - Uses url to create http request
     * @param bodyData - Sends to update to be used in body of http request
     * @return parsed json data from http request
     * @throws Exception
     */
    private String patch(URL url, String bodyData) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestProperty("X-HTTP-Method-Override", "PATCH");
        request.setRequestMethod("POST");
        request.setRequestProperty( "Content-Type", "application/json");
        request.setRequestProperty( "charset", "utf-8");
        request.setConnectTimeout(DEFAULT_HTTP_TIMEOUT);
        request.setDoOutput(true);

        consumer.sign(request);
        request.connect();

        return update(request, bodyData);
    }

    /**
     * Creates delete http request and authorizes with consumer
     * @param url - Uses url to create http request
     * @return null
     * @throws Exception
     */
    private String delete(URL url) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("DELETE");
        request.setRequestProperty( "Content-Type", "application/json");
        request.setRequestProperty( "charset", "utf-8");
        request.setConnectTimeout(DEFAULT_HTTP_TIMEOUT);
        consumer.sign(request);
        request.connect();

        return null;
    }

    /**
     * Creates get http request and authorizes with consumer
     * @param url - Uses url to create http request
     * @return parsed json data from http request
     * @throws Exception
     */
    private String get(URL url) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("GET");
        request.setRequestProperty( "Content-Type", "application/json");
        request.setRequestProperty( "charset", "utf-8");
        request.setConnectTimeout(DEFAULT_HTTP_TIMEOUT);

        consumer.sign(request);
        request.connect();

        return getJSON(request);
    }

    /**
     * Writes body data to body of http request
     * @param request - http request
     * @param bodyData - Body parameters to be used in http request
     * @return parsed json data from http request
     * @throws Exception
     */
    private String update(HttpURLConnection request, String bodyData) throws Exception {
        byte[] postDataBytes = bodyData.getBytes("UTF-8");
        request.getOutputStream().write(postDataBytes);

        return getJSON(request);
    }

    /**
     * Reads json data from http request
     * @param request - http request
     * @return parsed json data from http request
     * @throws Exception
     */
    private String getJSON(HttpURLConnection request) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line+"\n");
        }
        br.close();

        return sb.toString();
    }

    /**
     * Method to get all units in a facility
     * @return List of units in facility
     * @throws Exception
     */
    public UnitList getAllUnits() throws Exception {
        String json = forward("GET", facility_id + "/units", null);

        return gson.fromJson(json, UnitList.class);
    }

    /**
     * Method to get a specific unit in a facility
     * @param unit_id - id number of unit in facility
     * @return Specific unit in facility
     * @throws Exception
     */
    public SpecificUnit getSpecificUnit(String unit_id) throws Exception {
        String json = forward( "GET", facility_id + "/units/" + unit_id, null);

        return gson.fromJson(json, SpecificUnit.class);
    }

    /**
     * Method to get all available units in a facility
     * @return List of available units in facility
     * @throws Exception
     */
    public UnitList getAvailableUnits() throws Exception {
        String json = forward("GET", facility_id + "/units/available", null);

        return gson.fromJson(json, UnitList.class);
    }
}
