package com.sda.savejson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.JSON.Person;

import java.io.File;
import java.io.IOException;

public class Main
{
    static ObjectMapper mapper = new ObjectMapper();
    public static void savePersons()
    {
        Person Krzysztofex = new Person("Krzysztofex", "bylejaki", 88);
        try
        {
            mapper.writeValue(new File("osoba.json"), Krzysztofex);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        savePersons();
    }
}
