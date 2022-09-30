package oop_excercise;
import oop_excercise.Hamburger;

public class HealthyBurger extends Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    //String name,, String breadRollType

    public HealthyBurger( String meat, double price) {
        this.name = "Healthy";
        this.meat = meat;
        this.price = price;
        this.breadRollType = "Brown rye";
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




    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private String healthyExtra3Name;
    private String healthyExtra4Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;
    private double healthyExtra3Price;
    private double healthyExtra4Price;

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public String getHealthyExtra3Name() {
        return healthyExtra3Name;
    }

    public String getHealthyExtra4Name() {
        return healthyExtra4Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public double getHealthyExtra3Price() {
        return healthyExtra3Price;
    }

    public double getHealthyExtra4Price() {
        return healthyExtra4Price;
    }





    public void addHealthyAddition1 (String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }




    public double itemizeHamburger(){
        double itemizeHamburger = 0;
        itemizeHamburger += getHealthyExtra1Price() + getHealthyExtra2Price() + getAddition1Price()+ price;
        return itemizeHamburger;
    }

    @Override
    public String toString() {
        return  name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price + '\n' +
                "Added " + getAddition1Name() + " for an extra " + getAddition1Price() + '\n' +
                "Added " + getHealthyExtra1Name() + " for an extra " + getHealthyExtra1Price()
                ;

    }




}
