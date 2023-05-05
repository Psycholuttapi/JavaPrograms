import java.util.Scanner;

public class W11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int count=0;
        System.out.println("Enter the value of array");
        for (int i = 0; i <size; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        if(arr[i]%2==0)
        count++;
        System.out.println("NUmber of even numbers in the given array is   "+count);
    }
}
