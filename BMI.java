package com.example.bmi_calculator;

public class BMI {
    public static void main(String[] args) {
        double bmi = bodymassindex(75, 1.6);
        System.out.println("Your BMI: " + bmi);

    }

    public static double bodymassindex(double yourWeight, double yourHeight){

        double bmi = yourWeight / (yourHeight * yourHeight);

        if (bmi >25){
            System.out.println(" You are overweight");
        }
        else if (bmi <25 && bmi > 18.5){
            System.out.println("Your weight is Normal.");
        }
        else {
            System.out.println("You are underweight");
        }


        return bmi;
    }
}
