package ru.json;

import org.json.JSONObject;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JSONObject jsonCat = new JSONObject();
        jsonCat.put("name", "Izzy");
        jsonCat.put("breed", "Siamese");
        //System.out.println(jsonCat);

        JSONObject jsonOwner = new JSONObject();
        jsonOwner.put("text", "owner");
        jsonOwner.put("name", "Colin Wilcox");
        jsonOwner.put("list", List.of("1", "2", "3"));
        //List.of() позволяет создавать список из перечисленных элементов

        jsonCat.put("owner", jsonOwner);

        JSONObject jsonAddress = new JSONObject();
        jsonAddress.put("street", "Fleet Street");
        jsonAddress.put("house", "5");

        jsonOwner.put("address", jsonAddress);

        System.out.println(jsonCat);
    }
}
