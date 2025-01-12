package org.example;

import org.example.taskA.*;
import org.example.taskB.*;

public class Main {
    public static void main(String[] args) {

        ///////// TASK A //////////////

        Surgeon surgeon = new Surgeon();
        surgeon.setName("Alex");
        surgeon.setAge(32);
        surgeon.setGender("Male");
        surgeon.setContactNumber("+998900000000");
        surgeon.setExperience(5);
        surgeon.setSpecialty("surgeon");
        surgeon.setNumberOfSurgeries(30);
        surgeon.setSurgeryType("Neurosurgery");
        System.out.println(surgeon.toString());


        Cardiologist cardiologist = new Cardiologist();
        cardiologist.setName("Allyssa");
        cardiologist.setAge(29);
        cardiologist.setGender("Female");
        cardiologist.setContactNumber("998970900099");
        cardiologist.setExperience(6);
        cardiologist.setSpecialty("Cardiologist");
        cardiologist.setSurgeriesPerformed(10);
        cardiologist.setTreatmentFocus("Cardiac Surgery");
        System.out.println(cardiologist.toString());


        //////////// TASK B /////////////////////

        Laptop laptop = new Laptop();
        laptop.setBrand("Apple");
        laptop.setModel("MacBook Pro");
        laptop.setColor("Grey");
        laptop.setPrice(" $2500.0");
        laptop.setBatteryLife("20 hours");
        System.out.println(laptop.toString());

        Desktop desktop = new Desktop();
        desktop.setBrand("HP");
        desktop.setModel("envy desktop");
        desktop.setColor("Black");
        desktop.setPrice("$1000");
        desktop.setStorage("512GB SSD");
        System.out.println(desktop.toString());


        Sounds sounds = new Sounds();
        sounds.setDuration("180.5 seconds");
        sounds.setBrand("Sony");
        sounds.setModel("SRS-XB12");
        sounds.setPrice("$60");
        System.out.println(sounds.toString());










    }
}