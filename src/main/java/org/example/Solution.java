package org.example;

import java.util.*;
public class Solution {
    public static String spaces(String input, char ch, int L) {
        String str = String.format("%"+(-L)+"s", input).replace(' ', ch);
        return str;
    }

    public static String zeroes(int num) {
        int length = String.valueOf(num).length();
        String str = String.valueOf(num);
        if (length == 3) {
            return str;
        } else if (length == 2) {
            return String.format("%"+ (3)+"s",str).replace(' ', '0');
        } else { return String.format("%"+(3)+"s",str).replace(' ','0');
        }
    }
        public static void main (String[]args){
            int L = 15;
            char ch = ' ';
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.println(spaces(s1,ch,L)+""+zeroes(x));
            }
            System.out.println("================================");

        }
    }

