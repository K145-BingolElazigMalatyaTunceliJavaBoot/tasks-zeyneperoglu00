public abstract class Car {

    private int dailyRental;
    private int monthlyRental;
    private int luggageCapacity;
    private String color;

    public int getDailyRental() {

        return dailyRental;
    }

    public void setDailyRental(int dailyRental) {

        this.dailyRental = dailyRental;
    }

    public int getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(int monthlyRental) {
        this.monthlyRental = monthlyRental;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void aracKiralamaHesaplama(int gunlukKiralamaUcreti, int aylikKiralamaUcreti, int kiralananGunSayisi) {

        int gelir = gunlukKiralamaUcreti * kiralananGunSayisi;

        System.out.println(gelir);

    }

}