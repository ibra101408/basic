package oop_excercise;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        //System.out.println(hamburger);
        hamburger.addHamburgerAddition1("Tomato", 0.27); //
        hamburger.addHamburgerAddition2("Lettuce", 0.75); //
        hamburger.addHamburgerAddition3("Cheese", 1.13); //
        System.out.println(hamburger);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        System.out.println();

        DeluxeBurger db = new DeluxeBurger();
        System.out.println(db);
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());




        System.out.println();
    }
}
