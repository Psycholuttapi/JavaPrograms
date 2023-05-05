import java.util.Scanner;

public class W14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the arrays");
        int size=sc.nextInt();
        int arr1[][]=new int[size][size];
        int arr2[][]=new int[size][size];
        int array[][]=new int[size][size];
        
        System.out.println("Enter the value of array1");
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the value of array2");
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("array 1 is  ");
        
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println("");
        }

        System.out.println("array 2 is  ");
        
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println("");
        }
        

        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                array[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of 2 array is:");
        for (int i = 0; i <size; i++) {
            for (int j = 0; j <size; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println("");
        }
        
        
    }
}
