package interview;

import java.util.Scanner;

public class ArrayRotationRight {
    static void Rotate(int arr[],int d,int n){
        //n-d is done because we should upto the end of the array.
        d = n-d;
        int k=0;
        int temp[] = new int[n];
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    static void printthearray(int a[],int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        int n =arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rotations: ");
        int d = sc.nextInt();
        System.out.println("Right Rotation: ");
        System.out.println("Before Rotation: ");
        printthearray(arr,n);
        Rotate(arr,d,n);
        System.out.println("After Rotation: ");
        printthearray(arr,n);
    }
}
