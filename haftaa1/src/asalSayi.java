public class asalSayi
{
    public static void main(String[] args)
    {
        int count, toplam = 0;
        for(int sayi = 3; sayi <= 100; sayi++) {
            count = 0;
            for (int i = 2; i <= sayi/2; i++) {
                if(sayi % i == 0) {

                    count++;
                    break;
                }
            }
            if(count == 0) {

                toplam = toplam + sayi;
            }
        }
        System.out.println(" 3 ile 100 arasindaki asal sayilarin toplami: " + toplam);
    }
}