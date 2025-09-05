package week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the password:");
        String command = reader.nextLine();
        while (true){


            if (command.equals("parool")){
                System.out.println("Password is correct.");
                break;
            } else {
                System.out.println("Enter the correct password: ");
                command = reader.nextLine();
            }


        }
        System.out.println("Thank you see you later!");

    }
}
