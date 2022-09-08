package week2;

import java.io.StringReader;
import java.util.Scanner;

public class Ex56 {

    public static String reverse(String text) {
        String textRevers = "";
        int count = text.length();
        int index = count - 1;
        while(index >= 0){
            textRevers += text.charAt(index);
            index--;
        }
        return textRevers;
    }

    public static void main(String[] args) {
        System.out.print("Type in your text: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println(reverse(text));
        //System.out.println("In reverse order: " + reverse(text));
    }

}
