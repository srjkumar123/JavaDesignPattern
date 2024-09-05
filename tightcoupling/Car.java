package tightcoupling;

public class Car {
    PetrolEngine e;
    Car(){
        e = new PetrolEngine();
    }

    void move(){
        System.out.println("Car moves with: ");
        e.show();
    }
}
