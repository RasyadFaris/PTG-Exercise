/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptg.rasyad.occ7;

public class Person {
    //Attributes
    protected String name;
    protected int age;
    protected String id;

    //Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //Method 1
    public String getName() {
        return name;
    }

    //Method 2 (To be overridden)
    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}