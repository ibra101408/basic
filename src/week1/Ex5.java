package week1;

public class Ex5 {
    public static void main(String[] args) {
        Integer days = 365;
        Integer hours = 24;
        Integer minutes = 60;
        Integer seconds = 60;

        Integer secInYear = days * hours * minutes * seconds;
        System.out.println("There are "+ (365 * 24 * 60 * 60) + " sec in year");
        System.out.println("There are "+ secInYear + " sec in year");
    }
}
