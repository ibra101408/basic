package oop_excercise;

public class DeluxeBurger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    //String name, String meat, double price, String breadRollType
    public DeluxeBurger() {
        this.name = "Deluxe hamburger";
        this.meat = "Sausage & Bacon";
        this.price = 14.54;
        this.breadRollType = "White";
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
        this.addition1Name = "Chips";
        return addition1Name;
    }

    public String getAddition2Name() {
        this.addition2Name = "Drink";
        return addition2Name;
    }

    public String getAddition3Name() {
        this.addition3Name = "Cannot not add additional items to a deluxe burger";
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition1Price() {
        this.addition1Price = 2.75;
        return addition1Price;
    }

    public double getAddition2Price() {
        this.addition2Price = 1.81;
        return addition2Price;
    }

    public double getAddition3Price() {
       // this.addition3Price = null;
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }


   /* public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = "Chips";
        this.addition1Price = 2.75;
    }
    public addHamburgerAddition2(){
        this.addition2Name = "Drink";
        this.addition2Price = 1.81;
    }
*/
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = "cannot add anything";
        this.addition3Price = 0;
    }



    public double itemizeHamburger(){
        double itemizeHamburger = 0.00;
        itemizeHamburger += getAddition1Price() + getAddition2Price() + price;
        return itemizeHamburger;
    }



    @Override
    public String toString() {
        return  getAddition3Name() + '\n' +
                name + "  on a " + breadRollType + " roll with " + meat + " price is " + price + '\n' +
                "Added " + getAddition1Name() + " for an extra " + getAddition1Price() + '\n' +
                "Added " + getAddition2Name() + " for an extra " + getAddition2Price()
                ;

    }

}
