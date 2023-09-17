import java.util.ArrayList;
import java.util.Random;

public abstract class Pet extends Animal{

    int cuteness;
    public Pet(String name, String type, ArrayList<String> commands) {
        super(name, type, commands);
        this.cuteness = new Random().nextInt(10);
    }
}
