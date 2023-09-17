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
        while(true){
            if(checkNum(numFromUserData(operation))){
                switch (numFromUserData(operation)){
                    case 1:{
                        animal.getNewAnimal();
                    }
                    case 2:{
                        for (Animal animal: yourAnimals) {
                            animal.getInfo();
                        }
                    }
                    case 3:{
                        skills.trainAnimal(yourAnimals);
                    }
                    case 4:{
                        skills.showWhatYouCan(yourAnimals);
                    }
                    default:{
                        System.out.println("Всего хорошего!");
                        break;
                    }
                }
            }
        }
    }

    private void chooseOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет! Что будем делать?\n+" +
                "1 - Завести новое животное\n+" +
                "2 - Посмотреть моих животных\n+" +
                "3 - Обучить животное новой команде\n+" +
                "4 - Посмотреть, что умеет животное\n+" +
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
