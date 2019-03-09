package com.sda.readjson;
import com.sda.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.JSON.Person;

import java.io.File;
import java.io.IOException;

public class Main
{
 static ObjectMapper mapper = new ObjectMapper();

 public static void readPerson()
 {
     try
     {
         Person personRead = mapper.readValue(new File("osoba.json"), Person.class);
         System.out.println(personRead.toString());
     }catch(IOException e)
     {
         e.printStackTrace();
     }
 }

    public static void main(String[] args)
    {
        readPerson();
    }
}
