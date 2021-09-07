/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.nio.charset.StandardCharsets;
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Car issue diagnostic. Answer using lower case y or n\n");
        System.out.printf("Is the car silent when you turn the key? ");
        char a1 = sc.next().charAt(0);
        if (a1 == 'y')
        {
            System.out.printf("Are the battery terminals corroded? ");
            char a2 = sc.next().charAt(0);
            if (a2 == 'y')
                System.out.printf("Clean terminals and try again.");
            else
                System.out.printf("Replace cables and try again");
        }
        else
        {
            System.out.printf("Does the car make a slicking noise? ");
            char a3 = sc.next().charAt(0);
            if (a3 == 'y')
                System.out.printf("Replace the battery.");
            else
            {
                System.out.printf("Does the car crank up but fail to start? ");
                char a4 = sc.next().charAt(0);
                if (a4 == 'y')
                    System.out.printf("Check spark plug connections.");
                else
                {
                    System.out.printf("Does the engine start and then die? ");
                    char a5 = sc.next().charAt(0);
                    if (a5 == 'y')
                    {
                        System.out.printf("Does you car have fuel injection? ");
                        char a6 = sc.next().charAt(0);
                        if (a6 == 'y')
                            System.out.printf("Get it in for service.");
                        else
                            System.out.printf("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.printf("This should not be possible.");
                }
            }
        }
    }
}