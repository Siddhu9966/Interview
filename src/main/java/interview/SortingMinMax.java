package interview;

import java.util.Arrays;

public class SortingMinMax {
    static int min(int []arr){
        int min=500;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
    static int max(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ //50>0
                max=arr[i];
            }
        }
        return max;
    }
    static void sort(int []arr){
        int temp=0;
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = i + 1; j < arr.length; ++j)
            {
                if (arr[i] > arr[j])
                {
                    temp =  arr[i]; //temp = 5
                    arr[i] = arr[j];  // arr[0]=4
                    arr[j] = temp; //arr[i] = 5
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int arr[]= {5,9,6,7,8,6,4,5,25,69,1};
        System.out.println("Min value:" +min(arr));
        System.out.println("Max value:" +max(arr));
        sort(arr);

    }
}
