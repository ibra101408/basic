package week5;

public class Ex84 {
    public static void main(String[] args) {

        Counter p = new Counter(25, true);

        p.decrease();
        System.out.println(p.getAmount());

        p.increase(6);
        System.out.println(p.getAmount());

        p.decrease(100);
        System.out.println(p.getAmount());
    }
}