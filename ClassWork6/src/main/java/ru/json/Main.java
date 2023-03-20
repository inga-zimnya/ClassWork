package ru.json;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject jsonCat = new JSONObject();
        jsonCat.put("name", "Izzy");
        jsonCat.put("breed", "Siamese");
        //System.out.println(jsonCat);

        JSONObject jsonOwner = new JSONObject();
        jsonOwner.put("text", "owner");
        jsonOwner.put("name", "Colin Wilcox");

        JSONObject jsonAddress = new JSONObject();
        jsonOwner.put("street", "Fleet Street");
        jsonOwner.put("house", "5");

        jsonOwner.put("address", jsonAddress);
        jsonCat.put("owner", jsonOwner);

        System.out.println(jsonCat);
    }
}
