package week1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many seconds there are in a year?:");
        double seconds = reader.nextDouble();
        if (seconds == 31536000) {
            System.out.println("You are correct.");
        } else {
            int result = (60 * 60 * 24 * 365);
            System.out.println("You are incorrect.The correct answer is:" + result);
        }
    }
}

