import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int kg;
         double Armut =2.14,Elma = 3.67,Domates = 1.11, Muz = 0.95, Patlican = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kac kilo : ");
         kg = inp.nextInt();
        double ArmutTutar = kg*Armut;
        System.out.print("Elma kac kilo : ");
        kg = inp.nextInt();
        double ElmaTutar = kg*Elma;
        System.out.print("Domates kac kilo : ");
         kg = inp.nextInt();
         double domatesTutar = kg*Domates;
        System.out.print("Muz kac kilo : ");
         kg = inp.nextInt();
         double MuzTutar = kg*Muz;
        System.out.print("Patlican kac kilo : ");
        kg = inp.nextInt();
        double PatlicanTutar = kg*Patlican;


        double ToplamTutar =ArmutTutar+ElmaTutar+domatesTutar+MuzTutar+PatlicanTutar;

        System.out.print("Toplam Tutar : " +ToplamTutar );





    }
}