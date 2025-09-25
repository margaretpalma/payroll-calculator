package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name: ");
        String yourName = scanner.nextLine();

        System.out.println("Hours Worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("Pay Rate: ");
        float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.printf(yourName + " made " + "$" + grossPay + " this week.");
    }

}
