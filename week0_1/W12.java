import java.util.Scanner;

public class W12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value of array");
        for (int i = 0; i <size; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <size; i++) {
            for (int j=0; j<size-1-i; j++) {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
