import AnimalFarm.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    NewAnimal animal;
    AnimalSkills skills;
    ArrayList<Animal> yourAnimals;
    String operation;

    public Controller(){
        this.animal = new NewAnimal();
        this.yourAnimals = animal.getAnimals();
        this.skills = new AnimalSkills(yourAnimals);
        this.operation = null;
    }

    public void start(){
        chooseOperation();
            if(checkNum(numFromUserData(operation))){
                switch (numFromUserData(operation)){
                    case 1:{
                        animal.getNewAnimal();
                        start();
                    }
                    case 2:{
                        this.yourAnimals = animal.getAnimals();
                        for (Animal animal: yourAnimals) {
                            animal.getInfo();
                        }
                        start();
                    }
                    case 3:{
                        this.yourAnimals = animal.getAnimals();
                        skills.trainAnimal(yourAnimals);
                        start();
                    }
                    case 4:{
                        this.yourAnimals = animal.getAnimals();
                        skills.showWhatYouCan(yourAnimals);
                        start();
                    }
                    default:{
                        System.out.println("Всего хорошего!");
                    }
                }
            }
    }

    private void chooseOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Что будем делать?\n" +
                "1 - Завести новое животное\n" +
                "2 - Посмотреть моих животных\n" +
                "3 - Обучить животное новой команде\n" +
                "4 - Посмотреть, что умеет животное\n" +
                "5 - Завершить");
        this.operation = sc.nextLine();
    }

    private int numFromUserData(String userData){
        int operation = 0;
        try{
            operation = Integer.parseInt(userData);
        }catch (NumberFormatException e){
            System.out.println("Ой-ой, что-то пошло не так");
        }
        return operation;
    }

    private boolean checkNum(int num){
        boolean flag = true;
        if(num < 1 || num > 5){
            System.out.println("Что-то пошло не так");
            flag = false;
        }
        return flag;
    }
}
