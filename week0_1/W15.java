import java.util.Scanner;

public class W15 {
    public static void main(String[] args) {
        int arr[]=new int [5];
        System.out.println("enter the array values");
        
        W15 ob=new W15();
        ob.getArray(arr);
        ob.displayArray(arr);
    }
    void getArray(int a[]){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();   
        }
    }
    void displayArray(int a[]){
        System.out.println("\nThe entered array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);  
        }
    }
}
