package BulderDesignPattern.computerbuilder;

public class Computer {

        //required parameters
        private String HDD;
        private String RAM;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Computer(String HDD, String RAM, boolean isBluetoothEnabled, boolean isGraphicsCardEnabled){
            this.HDD = HDD;
            this.RAM = RAM;
            this.isBluetoothEnabled = isBluetoothEnabled;
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
