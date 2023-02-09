package se.lexicon.jennie;

abstract class Vehicle {

    private int vehicleId = 1;
    private String registrationNumber = "ABC123";
    private String brand = "Volvo";

    abstract void drive();
}