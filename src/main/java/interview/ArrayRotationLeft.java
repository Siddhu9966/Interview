package interview;
import java.util.*;
public class ArrayRotationLeft {
    static void Rotate(int arr[],int d,int n){

        int temp[] = new int[n];
        int k=0;
        //Shifting the elements after dth place into new array
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        //Shifting the elements from first element to dth element into new array.(Appending)
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        //Copying the temp array to original array.
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    static void printthearray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7}; // Left Rotation 3456712 // Right Rotation 6712345
        int n =arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rotations: ");
        int d = sc.nextInt();
        System.out.println("Left Rotation: ");
        System.out.println("Before Rotation: ");
        printthearray(arr,n);
        Rotate(arr,d,n);
        System.out.println("After Rotation: ");
        printthearray(arr,n);

    }
}
