package AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Horse extends PackAnimal{
    public Horse(String name) {
        super(name, "лошадь", new ArrayList<>(), new Random().nextInt(15));
    }
}
