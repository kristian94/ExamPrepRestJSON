/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Random;

/**
 *
 * @author Kristian
 */
public class DataGenerator {

    Random r = new Random();

    private String[] fnames = {"James", "Bob", "Henry", "Martin", "Jack", "Helen",
        "Maria", "Archimedes", "Jonathan", "Lisa", "Diana", "Janine", "Irene"};
    private String[] lnames = {"Johnson", "Smith", "Dean", "Reeves", "Jameson",
        "Ross", "Hughesley", "Bardino", "Morrison", "Jaque", "Custau", "Randolph",
        "Lenning"};
    private String[] streets = {"Moonstreet", "Parkway", "Park Avenue", "North Street",
        "Nørrebrogade", "Frederikssunsvej", "Strandvejen", "Nygade"};
    private String[] cities = {"København", "Birmingham", "New York", "Lyngby", "Hillerød", "Helsinge"};

    public String getData(int number, String params) {
        JsonArray arr = new JsonArray();
        for (int i = 0; i < number; i++) {
            JsonObject json = new JsonObject();
            if (params.contains("fname")) json.addProperty("fname", getRndFname());
            if (params.contains("lname")) json.addProperty("lname", getRndLname());
            if (params.contains("street")) json.addProperty("street", getRndStreet());
            if (params.contains("city")) json.addProperty("city", getRndCity());
            arr.add(json);            
        }
        return arr.toString();
    }

    protected String getRndFname() {
        int n = r.nextInt(fnames.length);
        return fnames[n];
    }

    protected String getRndLname() {
        int n = r.nextInt(lnames.length);
        return lnames[n];
    }

    protected String getRndStreet() {
        int n = r.nextInt(streets.length);
        return streets[n];
    }

    protected String getRndCity() {
        int n = r.nextInt(cities.length);
        return cities[n];
    }
}
