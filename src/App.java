import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int fält1_summa = 0;
        int fält2_summa = 0;
        int inputfält_summa = 0;
        int[] fält1 = {8,4,6,3,9};
        int[] fält2 = {18,14,16,13,19};
        int[] summafält = new int[5];
        int[] inputfält = new int[4];

        Scanner tan = new Scanner(System.in);

        for(int i = 0; i < fält1.length; i++){
            System.out.println(fält1[i]);
            fält1_summa += fält1[i];
        }

        for(int i = 0; i < fält2.length; i++){
            fält2_summa += fält2[i];
        }

        for(int i = 0; i < summafält.length; i++){
            summafält[i] = fält1[i] + fält2[i];
        }

        System.out.println("fält1 längd: " + fält1.length);

        double medelvärde_1 = fält1_summa/fält1.length;
        double medelvärde_2 = fält2_summa/fält2.length;

        System.out.println("fält 1 medelvärde: " + medelvärde_1);
        System.out.println("fält2 medlevärde: " + medelvärde_2);

        System.out.println("Summan av fält1: " + fält1_summa);
        System.out.println("summan av fält2: " + fält2_summa);
        
        for(int i = 0; i < inputfält.length; i++){
            System.out.print("Skriv in nummer: ");
            inputfält[i] = tan.nextInt();
        }

        for(int i = 0; i < inputfält.length; i++){
            inputfält_summa += inputfält[i];
        }

        System.out.println("inputfält summa: " + inputfält_summa);






    }
}
