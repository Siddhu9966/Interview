package interview;

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
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void sort(int []arr){
        int a=0;
        for (int i = 0; i < arr.length; ++i)
        {

            for (int j = i + 1; j < arr.length; ++j)
            {

                if (arr[i] > arr[j])
                {

                    a =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;

                }

            }

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]= {5,9,6,7,8,6,4,5,25,69,1};
        System.out.println("Min value:" +min(arr));
        System.out.println("Max value:" +max(arr));
        sort(arr);
    }
}
