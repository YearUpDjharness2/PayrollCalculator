package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculatorSimple {
    public static void main(String[] srgs){
        Scanner scanner = new Scanner(System.in);

        //prompt for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //prompt for hours worked
        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        //prompt for pay rate
        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();

        //calculate
        float grossPay = (hoursWorked > 40)
                ? (40 * payRate + (hoursWorked - 40) * payRate * 1.5f)
                : (hoursWorked * payRate);
        //display
        System.out.printf("Employee Name; %s%n ",name);
        System.out.printf("Gross Pay: $%.2f%n ",grossPay);




    }

}

