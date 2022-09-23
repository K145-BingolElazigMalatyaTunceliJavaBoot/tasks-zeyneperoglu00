import java.util.Scanner;

public class okulPuani {
    public static void main(String[] args) {

        int vize_notu,final_notu;
        double sonuc;

        Scanner scan= new Scanner(System.in);

        System.out.println("Vize Notunuzu Giriniz: ");
        vize_notu=scan.nextInt();

        System.out.println("Final Notunuzu Giriniz: ");
        final_notu=scan.nextInt();

        sonuc=(vize_notu*0.40+final_notu*0.60);
        System.out.println("Not: " + sonuc);

        if (sonuc<100 && sonuc>70) {

            System.out.println("Harf Notunuz AA");
        }
        else if (sonuc<70 && sonuc>50) {

            System.out.println("Harf Notunuz BB");
        }
        else if (sonuc<50 && sonuc>35) {

            System.out.println("Harf Notunuz DC");
        }
        else{
            System.out.println("Harf Notunuz FF");
        }
    }

}