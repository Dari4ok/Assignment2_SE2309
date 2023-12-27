package models;

public class Person {
    private static int id;

    private String name;

    private String surname;

    public String toString(int id, String name, String surname){

    }

    //getters and setters
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static void setId(int id) {
        Person.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
