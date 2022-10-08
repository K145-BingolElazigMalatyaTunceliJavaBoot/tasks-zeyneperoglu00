public abstract class meyve {

    String adi;

    public int kilo;

    public String rengi;


    protected void meyveOlustur(){
        System.out.println("Meyve oluştu");
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public String getKilo() {
        return adi;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

}
