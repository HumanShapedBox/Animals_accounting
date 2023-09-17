import java.util.ArrayList;
import java.util.Random;

public class PackAnimal extends Animal{

    int strength;
    public PackAnimal(String name, String type, ArrayList<String> commands) {
        super(name, type, commands);
        this.strength = new Random().nextInt(10);
    }
}
