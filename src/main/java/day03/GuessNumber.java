package day03;

import day02.Mathematics;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int randomNumber = new Random().nextInt(1, 100) +1;

    Scanner scanner = new Scanner(System.in);
   //Mathematics math = new Mathematics();

    public String getNumbers() {
        System.out.println("Adj meg egy egész számot 1-100 között: "+randomNumber);
        for ( int i = 0; i< 6 ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if( number < randomNumber) {
                System.out.println("A megadott szám kisebb, adj meg újat: "+randomNumber);
            } else if (number > randomNumber) {
                System.out.println("A megadott szám nagyobb, adj meg újat: "+randomNumber);
            } else if ( number == randomNumber ) {
                //System.out.println("Eltaláltad!");
                return "Eltaláltad a számot, ügyes vagy!";
            }
        }
        return "Nem találtad el számot, próbálkozz újra";
    }


    public int getRandomNumber() {
        return randomNumber;
    }


    public static void main(String[] args) {

        GuessNumber guessNumber = new GuessNumber();
        System.out.println(guessNumber.getNumbers());
    }
}
