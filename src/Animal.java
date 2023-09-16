import java.util.ArrayList;

public abstract class Animal implements AnimalsCan {

    protected final String name;
    protected final String type;
    protected ArrayList<String> commands;



    public Animal(String name, String type, ArrayList<String> commands) {
        this.name = name;
        this.type = type;
        this.commands = commands;
    }

    @Override
    public void getCommands() {
        if(this.commands.isEmpty()){
            System.out.printf("%s пока не знает никаких команд\n", this.name);
        }else{
            for (String command: this.commands) {
                System.out.println(command);
            }
        }
    }

    @Override
    public void addCommand(String command) {
        this.commands.add(command);
        System.out.printf("%s теперь знает команду '%s'\n", this.name, command);
    }
    // энум для типов, метод определения типа, присваивание типа в конструктореE
}
