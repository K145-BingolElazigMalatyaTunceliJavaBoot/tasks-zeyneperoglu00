public class sedan extends Car {

    @Override
    public void aracKiralamaHesaplama(int gunlukKiralamaUcreti, int aylikKiralamaUcreti, int kiralananGunSayisi) {
        int temizlikUcreti = 200;
        gunlukKiralamaUcreti = (kiralananGunSayisi * 200) + temizlikUcreti;
        System.out.println(gunlukKiralamaUcreti);
    }
}
