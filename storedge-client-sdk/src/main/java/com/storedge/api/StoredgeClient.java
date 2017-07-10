package main.java.com.storedge.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import main.java.com.storedge.api.interfaces.*;
import main.java.com.storedge.api.models.*;
import main.java.com.storedge.api.requests.*;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by vchadha on 6/8/17.
 */
public class StoredgeClient {

    /**
     * Set default http timeout to 10
     */
    private final int DEFAULT_HTTP_TIMEOUT = 10;

    /**
     * Api base url
     */
    private String base_url;
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
     * @param base_url
     */
    StoredgeClient(String api_key, String secret, String base_url) {
        this.base_url = base_url;

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
            url = new URL(base_url + uri);
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
                response = delete(url, bodyData);
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
    private String delete(URL url, String bodyData) throws Exception {
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("DELETE");
        request.setRequestProperty( "Content-Type", "application/json");
        request.setRequestProperty( "charset", "utf-8");
        request.setConnectTimeout(DEFAULT_HTTP_TIMEOUT);
        request.setDoOutput(true);

        consumer.sign(request);
        request.connect();

        if (bodyData != null)
            return update(request, bodyData);
        return getJSON(request);
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
        request.setDoInput(true);

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

    private String load(Options options) {
        if (options == null)
            return "";

        if (options.isEmpty())
            return "";

        StringBuilder query = new StringBuilder();
        query.append("?");

        boolean first = true;
        for (Map.Entry<String, String> pair : options.getOptions().entrySet()) {
            if (first)
                first = false;
            else
                query.append("&");

            query.append(pair.getKey() + "=" + pair.getValue());
        }

        return query.toString();
    }

    //Leads
    /**
     * Method to get all leads
     * @param facility_id
     * @param options
     * @return Lead list obj
     * @throws Exception
     */
    public LeadList getLeads(String facility_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/leads" + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, LeadList.class);
    }

    /**
     * Method to create a lead
     * @param facility_id
     * @param paymentMethodData
     * @param leadData
     * @param options
     * @return Specific lead obj
     * @throws Exception
     */
    public SpecificLead createLead(String facility_id, PaymentMethod paymentMethodData, Lead leadData, Options options) {
        JsonObject param = new JsonObject();
        param.add("payment_method", gson.toJsonTree(paymentMethodData));
        param.add("lead", gson.toJsonTree(leadData));

        String bodyData = gson.toJson(param);
        String json = "";

        try {
            json = forward("POST", facility_id + "/leads" + load(options), bodyData);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificLead.class);
    }

    /**
     * Method to delete existing lead (should work)
     * @param facility_id
     * @param lead_id
     * @param leadData
     * @param options
     * @return Specific Lead
     * @throws Exception
     */
    public SpecificLead deleteLead(String facility_id, String lead_id, DeleteLead leadData, Options options) {
        JsonObject lead = new JsonObject();
        lead.add("lead", gson.toJsonTree(leadData));

        String bodyData = gson.toJson(lead);
        String json = "";

        try {
            json = forward("DELETE", facility_id + "/leads/" + lead_id + load(options), bodyData);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificLead.class);
    }

    //Tenants
    /**
     * Method to sign up a tenant
     * @param tenant_id - Id of tenant to be signed up
     * @param tenantData - Tenant data (password and username)
     * @return Tenant object
     * @throws Exception
     */
    public SpecificTenant tenantSignUp(String facility_id, String tenant_id, Tenant tenantData, Options options) {
        JsonObject tenant = new JsonObject();
        tenant.add("tenant", gson.toJsonTree(tenantData));

        String bodyData = gson.toJson(tenant);
        String json = "";

        try {
            json = forward("POST", facility_id + "/tenants/" + tenant_id + "/sign_up" + load(options), bodyData);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificTenant.class);
    }

    /**
     * Method to change password for tenant
     * @param tenant_id - Id of tenant
     * @param tenantData - Tenant data (current password, new password)
     * @return Tenant object
     * @throws Exception
     */
    public SpecificTenant tenantChangePassword(String facility_id, String tenant_id, Tenant tenantData, Options options) {
        JsonObject tenant = new JsonObject();
        tenant.add("tenant", gson.toJsonTree(tenantData));

        String bodyData = gson.toJson(tenant);
        String json = "";

        try {
            json = forward("PUT", facility_id + "/tenants/" + tenant_id + "/change_password" + load(options), bodyData);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificTenant.class);
    }

    /**
     * Method to update an existing tenant
     * @param facility_id
     * @param tenant_id
     * @param tenantData
     * @param options
     * @return Tenant Response
     * @throws Exception
     */
    public SpecificTenant UpdateTenant(String facility_id, String tenant_id, Tenant tenantData, Options options) {
        JsonObject tenant = new JsonObject();
        tenant.add("tenant", gson.toJsonTree(tenantData));

        String bodyData = gson.toJson(tenant);
        String json = "";

        try {
            json = forward("PATCH", facility_id + "/tenants/" + tenant_id + load(options), bodyData);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificTenant.class);
    }

    //Unit groups
    /**
     * Method to get all unit groups
     * @param facility_id
     * @param options
     * @return UnitGroupList obj
     * @throws Exception
     */
    public UnitGroupList getUnitGroups(String facility_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/unit_groups" + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, UnitGroupList.class);
    }

    /**
     * Method to get specific unit group
     * @param facility_id
     * @param unit_group_id
     * @param options
     * @return Specific Unit Group obj
     * @throws Exception
     */
    public SpecificUnitGroup getSpecificUnitGroup(String facility_id, String unit_group_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/unit_groups/" + unit_group_id + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificUnitGroup.class);
    }

    /**
     * Method to get units in specific unit group
     * @param facility_id
     * @param unit_group_id
     * @param options
     * @return Unit List obj
     * @throws Exception
     */
    public UnitList getUnitGroupUnits(String facility_id, String unit_group_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/unit_groups/" + unit_group_id + "/units" + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, UnitList.class);
    }

    //Units
    /**
     * Method to get all units in a facility
     * @return List of units in facility
     * @throws Exception
     */
    public UnitList getAllUnits(String facility_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/units" + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, UnitList.class);
    }

    /**
     * Method to get a specific unit in a facility
     * @param unit_id - id number of unit in facility
     * @return Specific unit in facility
     * @throws Exception
     */
    public SpecificUnit getSpecificUnit(String facility_id, String unit_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/units/" + unit_id + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, SpecificUnit.class);
    }

    /**
     * Method to get all available units in a facility
     * @return List of available units in facility
     * @throws Exception
     */
    public UnitList getAvailableUnits(String facility_id, Options options) {
        String json = "";

        try {
            json = forward("GET", facility_id + "/units/available" + load(options), null);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }

        return gson.fromJson(json, UnitList.class);
    }

}
