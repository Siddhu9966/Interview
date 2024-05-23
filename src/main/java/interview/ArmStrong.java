package interview;

public class ArmStrong {
    public static void main(String[] args){
        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result = (int) (result+ Math.pow(remainder, 3));
            originalNumber = originalNumber/10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
//153 --> 1^3 + 5^3+3^3 = 1 + 125+27 = 153
// 1*1*1  = 1
//5*5*5 = 125
//3*3*3 = 27

//20895 = 2*2*2 = 8
/*
10)371(37
    370
   -------
       1
 */