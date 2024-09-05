package FactoryDesign;

import FactoryDesign.com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory os1 = new OperatingSystemFactory();

        os1.getInstance("open").spec();
    }
}
