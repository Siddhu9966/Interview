package interview;

public class SwaptheString {
    public static void main(String[] args){
        String str1="Good", str2="Morning";
        System.out.println("Strings before swapping: "+str1+" "+str2);
        str1 = str1+str2;
        System.out.println(str1);
        str2 = str1.substring(0,(str1.length()-str2.length()));
        System.out.println((str1.length()-str2.length()));
        str1=str1.substring(str2.length());
        System.out.println("Strings after swapping: "+str1+" "+str2);
        //GoodMorning 11-4 == 7
    }
}
