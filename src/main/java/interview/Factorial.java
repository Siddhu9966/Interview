package interview;

public class Factorial {
    static int fact(int num) {
        //A method calling itself.
        if(num==1){
            return 1;
        }
        else{return (num* fact(num-1));
         // 5*fact(4) -->5*4*fact(3) --> 5*4*3*fact(2) --> 5*4*3*2*fact(1) --> 5*4*3*2*1  -->  120
    }
    }
    public static void main(String[] args){
        int fact=1;
        int num=5;
        fact = Factorial.fact(num);
        System.out.println(fact);
    }
}
