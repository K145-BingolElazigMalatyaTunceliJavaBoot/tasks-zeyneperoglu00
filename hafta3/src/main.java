import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Meyve adını yazınız");
                String meyveAdi = scanner.next();
                System.out.println("Kaç kilo alınacak.");
                int kilo = scanner.nextInt();
                System.out.println("Meyve:" + meyveAdi + "kilosu:" + kilo);
                int toplam = kilo * 10;
                System.out.println("Ödenecek tutar" + toplam);
                System.out.println("Çıkış için f tuşuna basınız");
                String exit = scanner.next();
                if (exit.equals("f")) {
                    break;


            }

            System.out.println("Meyveniz hazır. ");


        }

    }
}