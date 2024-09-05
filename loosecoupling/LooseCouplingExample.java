package loosecoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        Car1 car1 = new Car1(new PetrolEngine());
        car1.move();

        Car1 car2 = new Car1(new DieselEngine());
        car2.move();
    }

}
