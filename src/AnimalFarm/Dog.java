package AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Dog extends Pet{
    public Dog(String name) {
        super(name, "собака", new ArrayList<String>(), new Random().nextInt(10));
    }
}
