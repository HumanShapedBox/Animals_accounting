package AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public class Donkey extends PackAnimal{
    public Donkey(String name) {
        super(name, "осёл", new ArrayList<String>(), new Random().nextInt(10));
    }
}
