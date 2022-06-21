package estagio_teste;
import java.util.*;


public class faturamento {
    public static void main(String[] args) {
        
        System.out.println("Faturamento");
        Scanner sc = new Scanner(System.in);
        double sp = 67.83643;
        double rj = 36.67866;
        double mg = 29.229880;
        double es = 27.165480;
        double outros = 19.84953;

        double total = sp + rj + mg + es + outros;
        double percentualSP = (sp * 100) / total;
        double percentualRJ = (rj * 100) / total;
        double percentualMG = (mg * 100) / total;
        double percentualES = (es * 100) / total;
        double percentualOutros = (outros * 100) / total;

        System.out.println("SP – R$" + sp + " - " + percentualSP + "%");
        System.out.println("RJ – R$" + rj + " - " + percentualRJ + "%");
        System.out.println("MG – R$" + mg + " - " + percentualMG + "%");
        System.out.println("ES – R$" + es + " - " + percentualES + "%");
        System.out.println("Outros – R$" + outros + " - " + percentualOutros + "%");


    }
    
}
