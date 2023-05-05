import java.util.Scanner;
public class re {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String st1=sc.next();
        re ob=new re();
        ob.nextnew(0,st1);
    }
    void nextnew(int c,String st)
    {
        if(c<7)
        {
            System.out.println(st);
            c++;
            nextnew(c,st);
        }
        else
        return;
    }
}
