package interview;

public class ArrayDuplicate {
    public static void main(String args[]){
        int a[] = {3,4,5,3,2,9,4,2,2};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate value: "+a[i]);
                    break;
                }

            }
        }
    }
}
