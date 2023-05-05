import java.util.*;
class W8
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(i%2!=0)
        sum=sum+i;
        }
        System.out.println(sum);
    }
}