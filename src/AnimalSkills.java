import AnimalFarm.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalSkills {

    ArrayList<Animal> userAnimals;

    public AnimalSkills(ArrayList<Animal> animals){
        this.userAnimals = animals;
    }

    public void showWhatYouCan(ArrayList<Animal> animals){
        for (Animal userAnimal: animals) {
            userAnimal.getCommands();
        }
    }

    public void trainAnimal(ArrayList<Animal> animals){
        String name = getName();
        if(findAnimal(animals, name)){
            for (Animal useranimal: animals) {
                if(useranimal.equals(name)){useranimal.addCommand(getCommand());}
            }
        }else {
            System.out.println("Такого животного нет");
        }
    }
    
    private boolean findAnimal(ArrayList<Animal> animals, String name){
        boolean isHere = true;
        for (Animal userAnimal: animals) {
            if(userAnimal.equals(name)){
                return isHere;
            }
        }
        return !isHere;
    }

    private String getName(){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите имя питомца, которого нужно тренировать");
        name = sc.nextLine();
        return name;
    }

    private String getCommand(){
        String command;
        Scanner sc = new Scanner(System.in);
        System.out.println("Чему научим? Напишите название команды");
        command = sc.nextLine();
        return command;
    }
}
