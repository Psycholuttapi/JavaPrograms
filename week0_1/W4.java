import java.util.Scanner;

public class W4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mark");
        float mark=sc.nextFloat();
        if (mark>=50) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
                        
        }
    }
}
