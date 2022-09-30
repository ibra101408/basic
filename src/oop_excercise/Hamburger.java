package oop_excercise;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger() {
    }


    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }




    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;



    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }


    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }


    public double itemizeHamburger(){
        double itemizeHamburger = 0;
        itemizeHamburger += getAddition1Price() + getAddition2Price() + getAddition3Price() + price;
        return itemizeHamburger;
    }

    @Override
    public String toString() {
        return  name + " hamburger on a " + breadRollType + " roll with " + meat + " price is " + price + '\n' +

        "Added " + getAddition1Name() + " for an extra " + getAddition1Price() + '\n' +
        "Added " + getAddition2Name() + " for an extra " + getAddition2Price() + '\n' +
        "Added " + getAddition3Name() + " for an extra " + getAddition3Price()
                //  + '\n'  +     "Total Burger price is " + itemizeHamburger()
         ;

    }

}

/*
public int price(){
        int price = 0;
        for (Purchase purchase : this.purchases.values()) {
            price += purchase.price();
        }
        return price;
    }
*/


