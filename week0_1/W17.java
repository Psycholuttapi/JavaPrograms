import java.util.Scanner;

public class W17 {
    float ans;
    
    
    public static void main(String[] args) {
        W17 ob=new W17();
        int count=0;
        float num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        ob.ans=sc.nextInt();
        while (count<10)
        {
            System.out.println("Select the operator");
            System.out.println("+");
            System.out.println("-");
            System.out.println("*");
            System.out.println("/");
            System.out.println("=");
            System.out.println("choice a valid one");
            char ch=sc.next().charAt(0);
            switch(ch){

                // Calling Addition method
                case '+':
                System.out.println("Enter the next number");
                num=sc.nextFloat();
                ob.addition(num);
                break;

                // Calling Addition method
                case '-':
                System.out.println("Enter the next number");
                num=sc.nextFloat();
                ob.subtraction(num);
                break;

                case '*':
                System.out.println("Enter the next number");
                num=sc.nextFloat();
                ob.multiplication(num);
                break;

                case '/':
                System.out.println("Enter the next number");
                num=sc.nextFloat();
                ob.division(num);
                break;

                case '=':
                ob.equal();
                count=10;
                break;
                default:
                System.out.println("invalid input");
                count--;
                break;
            }
            count++;
        }
    }
    void addition(float n)
    {
        ans=ans+n;
    }
    void subtraction(float n)
    {
        ans=ans-n;
    }
    void multiplication(float n)
    {
        ans=ans*n;
    }
    void division(float n)
    {
        ans=ans/n;
    }
    void equal()
    {
        System.out.println(ans);
    }
}
