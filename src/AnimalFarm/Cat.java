package AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Cat extends Pet{
    public Cat(String name) {
        super(name, "кошка", new ArrayList<>(), new Random().nextInt(15));
    }
}
