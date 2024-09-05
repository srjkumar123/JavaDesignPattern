package BulderDesignPattern.computerbuilder;

public class Mainc {
    public static void main(String[] args) {

        Computer newComputer = new ComputerBuilder().setHDD("12").setHDD("HDD").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).getComputer();
        System.out.println(newComputer.toString());
    }
}
