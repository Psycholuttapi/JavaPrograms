import java.util.Scanner;

public class W5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float mark=sc.nextFloat();

        if(mark>90)
        System.out.println("A");
        else if(mark<=89&&mark>80)
        System.out.println("B");
        else if(mark<=79&&mark>70)
        System.out.println("C");
        else if(mark<=69&&mark>60)
        System.out.println("D");
        else if(mark<=59&&mark>50)
        System.out.println("E");
        else
        System.out.println("failed");
    }
}
