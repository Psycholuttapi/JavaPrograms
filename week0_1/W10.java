import java.util.Scanner;

public class W10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the arrays");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        System.out.println("Enter the value of array1");
        for (int i = 0; i <size; i++) {
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("Enter the value of array2");
        for (int i = 0; i <size; i++) {
            arr2[i]=sc.nextInt();
        }
        for (int i = 0; i <size; i++) {
            int temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        
        System.out.println("value of array1");
        for (int i = 0; i <size; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("value of array2");
        for (int i = 0; i <size; i++) {
            System.out.println(arr2[i]);
        }
    }
}
