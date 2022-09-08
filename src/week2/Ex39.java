package week2;

public class Ex39 {
    private static void printSquere(int width, int height) {
        int row = 1;
        while (row <= height) {
            int field = 1;
            while (field <= width) {
                System.out.print("*");

                field++;
            }
            System.out.println();
            row++;
        }
    }


    public static void main(String[] args) {
        printSquere(5,4);

    }

}

