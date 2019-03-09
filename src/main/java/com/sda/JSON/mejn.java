package com.sda.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class mejn
{
    public static void main(String[] args)
    {
    Person krzychu = new Person("krzychu", "polak", 30);
    Person krzysztof = new Person("krzysztof", "niemiec", 33);
    ObjectMapper mapper = new ObjectMapper();
    try
    {
        mapper.writeValue(new File("osoby.json"), krzychu);
        Person personRead = mapper.readValue(new File("osoby.json"), Person.class);
        System.out.println(personRead.toString());
    }catch(IOException e)
    {
        e.printStackTrace();
    }

    }
}
