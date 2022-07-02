package com.ujjwal;

public class Main {
    public static boolean primeNumber(int n) {
        int y = 1;
        while(n>0)
        {
            y++;
            if(n%y == 0)
                return false;
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        int count = 0;
        while(n>1)
        {
            boolean a = primeNumber(--n);
            if(a==true)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
