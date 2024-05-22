package org.example;

public class DuplicateString
        {
            public static void main(String[] args){
                String word ="ValueMomentum";
                Character check = word.charAt(0);
                boolean Repeat = false;
                for(int i=1; i<word.length();i++){
                    if(check==word.charAt(i)){
                        System.out.println("Character value true:"+check);
                        Repeat =true;
                        break;
                    }
                }
                if(Repeat==false){
                    System.out.println("Character value false:"+check);
                }
            }
}
