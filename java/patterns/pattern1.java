package patterns;

public class pattern1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2; j++) {

                for (int j2 = i; j2 < 10; j2++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
