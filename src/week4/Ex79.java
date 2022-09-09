package week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        NumberStatistics all = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();

        System.out.println(" type: ");
        Scanner reader = new Scanner(System.in);

        int number;
        while (true){
            number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            }
            all.addNumber(number);
            if(number % 2 == 0){
                even.addNumber(number);
            }else {
                odd.addNumber(number);
            }
        }

       /* stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);*/
        System.out.println("Amount: " + all.amountOfNumbers());
        System.out.println("sum: " + all.sum());
        //System.out.println("average: " + all.average());
        System.out.println("odd: " + even.sum());
        System.out.println("even: " + odd.sum());
    }
}