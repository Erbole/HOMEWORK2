package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(20, 30));
        System.out.println(ageTemperature(40, 25));
        System.out.println(ageTemperature(45, 40));
        System.out.println(ageTemperature(34, -25));
        System.out.println(ageTemperature(18, -18));

        System.out.println(generateRandomAge()+ageTemperature(generateRandomAge(),25));


    }

    public static String ageTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        }
        else if (age <= 20 && temperature >0&&temperature<=28){return "Можно идти гулять";}
        else {return "Нельзя идти гулять";}
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }


}





















