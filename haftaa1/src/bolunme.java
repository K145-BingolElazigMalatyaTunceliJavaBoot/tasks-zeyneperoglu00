public class bolunme {
    public static void main(String[] args) {

        int toplam=0;
        System.out.print("3e tam bolunenlerin disindaki toplam: ");
        for (int i=200; i<500; i++) {
            if (i%3==0) {
                continue;
            }
            toplam= toplam+i;
            System.out.println(toplam);
        }
    }
}
