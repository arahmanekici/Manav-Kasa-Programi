import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Manav Kasa Programına Hoşgeldiniz \r");
        Scanner input = new Scanner(System.in);
        //Meyve Ücret Bilgileri
        float Armut = 2.14F, Elma = 3.67F, Domates = 1.11F, Muz = 0.95F,  Patlican = 5.00F;


        System.out.println("Kaç kilo Armut? :");
        int Kilo= input.nextInt();
        Armut*=Kilo;

        System.out.println("Kaç kilo Elma? :");
        Kilo= input.nextInt();
        Elma*=Kilo;

        System.out.println("Kaç kilo Domates? :");
        Kilo= input.nextInt();
        Domates*=Kilo;

        System.out.println("Kaç kilo Muz? :");
        Kilo= input.nextInt();
        Muz*=Kilo;

        System.out.println("Kaç kilo Patlican? :");
        Kilo= input.nextInt();
        Patlican*=Kilo;

        float Toplam= Armut+Elma+Domates+Muz+Patlican;
        System.out.println("Toplam Tutar :"+ Toplam + "TL");

    }
}
