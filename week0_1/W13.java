import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            flag=1;
        }
        if(flag==1)
        System.out.println("Entered string is not a palindrome");
        else 
        System.out.println("Entered string is a palindrome");
    }
}
