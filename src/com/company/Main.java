package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int a = 1;
        while(a == 1) {

            System.out.println("Which times tables do you want?");
            double usersTimesTable = input.nextDouble();
            for (double i = 1; i <= 10; i++) {
                double answer = usersTimesTable * i;
                System.out.println(usersTimesTable + " times " + i + " = " + answer);


            }
        }
    }
}
