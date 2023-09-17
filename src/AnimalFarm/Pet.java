package AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pet extends Animal{

    int cuteness;
    public Pet(String name, String type, ArrayList<String> commands, int cuteness) {
        super(name, type, commands);
        this.cuteness = cuteness;
    }
}
