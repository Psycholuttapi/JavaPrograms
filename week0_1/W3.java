import java.util.Scanner;
public class W3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("principal amount");
        int p=sc.nextInt();
        System.out.println("Interest rate");
        float R=sc.nextFloat();
        System.out.println("Number of years");
        float n=sc.nextFloat();

        float SI=p*R*n/100;
        System.out.println(SI);
        
    }
}
