package BulderDesignPattern;

public class Shop {

    public static void main(String[] args) {
     Phone newphone = new PhoneBuilder().setOs("IOS")
                                        .setBattery(5000)
                                        .setProcessor("Qualcommn 760")
                                        .setRam(8).setScreenSize(6.5).getPhone();

        System.out.println(newphone);


        Phone realme15 = new PhoneBuilder().setOs("Android")
                .setBattery(8000)
                .setProcessor("Qualcommn 900")
                .setRam(12).setScreenSize(6.5).getPhone();
        System.out.println(realme15);


        Phone nokia = new PhoneBuilder().setBattery(500).setScreenSize(2).getPhone();
        System.out.println(nokia);
    }
}
