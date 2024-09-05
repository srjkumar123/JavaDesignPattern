package loosecoupling;

import tightcoupling.PetrolEngine;

public class Car1 {
    Engine e;
    Car1(Engine e){

        this.e = e;
    }

    void move(){
        System.out.println("Car engine: ");
        e.show();
    }
}
