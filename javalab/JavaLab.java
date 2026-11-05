/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalab;

import java.util.Scanner;

/**
 *
 * @author PANAL_CPE113
 */
public class JavaLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
            double kWh        = 250;
            double rate       = 12.50;
            double percentage = 5;
        
        double consumption = calculateConsumptionCharge(kWh, rate);    
        double additional  = calculateAdditionalCharge (consumption, percentage);
        double total       = calculateTotalBill (consumption,additional);
        
        System.out.println("==========================");
        System.out.println("    Electricity bill    ");
        System.out.printf("Consumption Charge: P%.2f%n", consumption);
        System.out.printf("Additional Charge: P%.2f%n", additional);
        System.out.printf("Total Electricity Bill: P%.2f%n", total);
        System.out.println("==========================");
        
        Scanner input = new Scanner(System.in);
        System.out.println("    Grade Evaluator    ");
        System.out.print("Enter Prelim Score: ");
        double prelim = input.nextDouble();
        System.out.print("Enter Midterm Score: ");
        double midterm = input.nextDouble();
        System.out.print("Enter Final Score: ");
        double finals = input.nextDouble();
        double average = calculateAverage(prelim, midterm, finals);
        char grade = getGradeEquivalent(average);
        boolean passed = isPassed(average);
        
        System.out.println(" Grade Results ");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade Equivalent: " + grade);
        System.out.println("Passing Status: " + (passed ? "Passed" : "Failed"));
        
    }
    public static double calculateConsumptionCharge(double kWh, double rate) {
        return kWh * rate;
    }
    public static double calculateAdditionalCharge(double consumptionCharge, double percentage) {
        return consumptionCharge * (percentage / 100);
    }
    public static double calculateTotalBill(double consumptionCharge, double additionalCharge){
        return consumptionCharge + additionalCharge;
    }
    public static double calculateAverage(double prelim, double midterm, double finals){
        return (prelim + midterm + finals) / 3;
    }
    public static char getGradeEquivalent(double average){
        if (average >= 90){
            return 'A';
        }else if (average >= 85){
            return 'B';
        }else if (average >= 80){
            return 'C';
        }else if (average >= 75){
            return 'D';
        }else{
            return 'F';
        }
    }
    public static boolean isPassed(double average){
        if (average >= 75){
            return true;
        }else{
            return false;
        }
    }
}
