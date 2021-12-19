package day02;

import java.util.Scanner;

public class Mathematics {

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for ( int i = 2; i < number/2; i++){
            if ( number%i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the possible prime number: ");
        int number = Integer.parseInt(scan.nextLine());
        boolean isItPrime = math.isPrime(number);
        System.out.println("The number("+number+") is prime? "+isItPrime);
    }
}
