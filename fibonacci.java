package estagio_teste;

import java.util.*;


public class fibonacci {
    public static void main(String[] args) {

        System.out.println("Fibonacci function");
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int number = 1;
        List<Integer> fibbonaci = new ArrayList<>();
        fibbonaci.add(0);
        fibbonaci.add(1);
        for (int i = 2; i < n; i++) {
            fibbonaci.add(fibbonaci.get(i - 1) + fibbonaci.get(i - 2));
            
        }
        if (fibbonaci.contains(number)) {
            System.out.println("The number: "+ number +" is in the Fibbonaci sequence");
        }

        System.out.println(fibbonaci);

    }
}