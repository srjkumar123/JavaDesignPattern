package BulderDesignPattern.computerbuilder;

public class ComputerBuilder {
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;



    public ComputerBuilder setHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }



    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }



    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
        return this;
    }



    public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
        this.isBluetoothEnabled = bluetoothEnabled;
        return this;
    }


    public Computer getComputer(){
        return new Computer(HDD, RAM, isBluetoothEnabled,isGraphicsCardEnabled);
    }
}
