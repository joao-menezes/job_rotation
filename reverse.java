package estagio_teste;

import java.util.Scanner;

public class reverse {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        char[] fraseChar = frase.toCharArray();
        int tamanho = fraseChar.length;
        char[] fraseInvertida = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
            fraseInvertida[i] = fraseChar[tamanho - i - 1];
        }
        String fraseInvertidaString = new String(fraseInvertida);
        System.out.println(fraseInvertidaString);
    
    }    
}
