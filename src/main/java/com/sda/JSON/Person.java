package com.sda.JSON;

public class Person
{
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person()
    {
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
