package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Токарева Саша", 5);

        Engine engine = new Engine(250, "Audi A6");

        Lorry lorry = new Lorry("Nisan", "SUV", 5000, driver, engine, 10000);

        System.out.println(lorry.toString());

        System.out.println("Производитель двигателя: " + lorry.getEngine().getManufacturer());

        lorry.getEngine().setManufacturer("Tayota");

        System.out.println("Производитель двигателя после изменений: " + lorry.getEngine().getManufacturer());
    }
}