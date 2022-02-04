import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Manav Kasa Programına Hoşgeldiniz \r");
        Scanner input = new Scanner(System.in);
        //Meyve Ücret Bilgileri
        float Armut = 2.14F, Elma = 3.67F, Domates = 1.11F, Muz = 0.95F,  Patlican = 5.00F;


        System.out.println("Kaç kilo Armut? :");
        int ArmutKilo= input.nextInt();
        System.out.println("Kaç kilo Elma? :");
        int ElmaKilo= input.nextInt();

        System.out.println("Kaç kilo Domates? :");
        int DomatesKilo=input.nextInt();
        System.out.println("Kaç kilo Elma? :");
        int MuzKilo=input.nextInt();
        System.out.println("Kaç kilo Elma? :");
        int PatlicanKilo = input.nextInt();
        float Toplam= (Armut*ArmutKilo)+(Elma*ElmaKilo)+(Domates*DomatesKilo)+(Muz*MuzKilo)+(Patlican*PatlicanKilo);
        System.out.println("Toplam Tutar :"+ Toplam + "TL");

    }
}
