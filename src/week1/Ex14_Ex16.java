package week1;

import java.util.Scanner;

public class Ex14_Ex16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number - ");

        int a = sc.nextInt();
        if ( a >= 0 && a % 2 == 0 )  {
            System.out.println("The number is positive and even");
        }
        else if ( a >= 0 && a % 2 == 1 ){
            System.out.println("The number is positive and odd");
        }
        else if ( a < 0 && a % 2 == 0 ) {
            System.out.println("The number is not positive and even");
        }
        else {
            System.out.println("The number is not positive and odd");
        }
    }
}
