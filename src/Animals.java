import java.util.ArrayList;

public abstract class Animals implements AnimalsCan {

    protected final String name;
    protected final String type;
    protected ArrayList<String> commands;



    protected Animals(String name, String type, ArrayList<String> commands) {
        this.name = name;
        this.type = type;
        this.commands = commands;
    }
}
