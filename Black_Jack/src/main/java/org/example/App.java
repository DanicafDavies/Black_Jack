package org.example;
import java.util.Scanner;
/**
 * File_Name: Jack_Black
 * Coding Language: Java
 * Author: Danica Davies
 * Date of creation: 20/10/23
 * Date of last update: 20/10/23
 * Description: Creating a basic blackjack inspired game which takes 2 integers
 * checks what has the greater value closest to 21 but not above and returning
 * the larger number. If both are over 21 then returning 0 **/
public class App 
{
    public static void main(String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        Scanner myStr = new Scanner(System.in);

        System.out.println("Enter First Player Name");
        String Player1 = myStr.nextLine();
        System.out.println("Enter Second Player Name");
        String Player2 = myStr.nextLine();

        System.out.println("Enter First Number");
        int Number1 = myObj.nextInt();
        System.out.println("Enter Second  Number");
        int Number2 = myObj.nextInt();

        if(Number1 < 1 || Number2 < 1)
        {
        System.out.println("Please put Numbers above 0");
        }
        else if (Number1 > 21 && Number2 > 21)
        {
            System.out.println("BUST both Players above 21");
        }
        else if (Number1 > Number2 && Number1 < 21 || Number1 < 21 && Number2 > 21)
        {
            System.out.println("Player 1 " + Player1 + " Wins");
        }
        else if (Number2 > Number1 && Number2 < 21 || Number2 < 21 && Number1 > 21)
        {
            System.out.println("Player  " + Player2 + " Wins");
        }
    }
}
