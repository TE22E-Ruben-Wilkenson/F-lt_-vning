public class App {
    public static void main(String[] args) throws Exception {
        
        int fält1_summa = 0;
        int[] fält1 = {8,4,6,3,9};

        for(int i = 0; i < fält1.length; i++){
            System.out.println(fält1[i]);
            fält1_summa += fält1[i];
        }


        System.out.println("längd: " + fält1.length);

        double medelvärde = fält1_summa/fält1.length;
        System.out.println("medelvärde: " + medelvärde);

        






    }
}
