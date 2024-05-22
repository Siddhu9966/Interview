package interview;

public class SwapInteger {
    static void swapValuesUsingThirdValue(int m,int n){
        int temp = m;
        m =n;
        n=temp;
        System.out.println("m: "+m+" n: "+n);
    }
    static void swapValues(int m,int n){
        m=m-n;
        n=m+n;
        m=n-m;
        System.out.println("m: "+m+" n: "+n);
    }
    public static void main(String[] args){
        int m=9,n=5;
        System.out.println("Before Swap using third variable: m,n: "+m+","+n);
        swapValuesUsingThirdValue(m,n);
        System.out.println("Before Swap: m,n without third variable: "+m+","+n);
        swapValues(m,n);
    }
}
