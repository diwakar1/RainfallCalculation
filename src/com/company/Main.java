package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Rainfall();
    }





        public static void Rainfall(){
        Scanner input = new Scanner(System.in);
         double lenOfRoof;
         double widthOfRoof;
         int numberOfRainfallInch;
         double totalRainOff = 0;

        System.out.println( " enter the lenOfRainfall");
        lenOfRoof = input.nextDouble();
        System.out.println( " enter the widthOfRoof");
            widthOfRoof = input.nextDouble();
        System.out.println( " enter the numberOfRainfallInch");
        numberOfRainfallInch = input.nextInt();
        double widthOfRoofInInch = 12* widthOfRoof;
        double lenOfRoofInInch = 12* lenOfRoof;

        totalRainOff = widthOfRoofInInch*lenOfRoofInInch* numberOfRainfallInch;
        double totalrainoffInGallon = totalRainOff/231;
        System.out.println(" total rainoff  in cubic gallon is:"  + totalrainoffInGallon);

    }
}