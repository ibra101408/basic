package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

    System.out.println("Type number: ");
    Scanner reader = new Scanner(System.in);
    int number;
    int sum = 0;
    int count = 0;
    int even = 0;
    int odd = 0;
    while (true) {
        number = Integer.parseInt(reader.nextLine());

        if(number == -1){
            break;
        }
        sum += number; //sum = sum + number
        count++;
        System.out.println(sum);
        if( number % 2 == 0){
            even++;
        }else {
            odd++;
        }
    }


    System.out.println("Your sun is " + sum);
    System.out.println("count is: " + count);
    double avg = (double)sum / count;
    System.out.println("avg is: " + avg);
    System.out.println("even is: " + even);
    System.out.println("odd is: " + odd);

    }
}
