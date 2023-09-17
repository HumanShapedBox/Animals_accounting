import AnimalFarm.*;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAnimal {
        ArrayList<Animal> yourAnimals;
        AnimalCounter counter;

        public NewAnimal(){
            this.yourAnimals = new ArrayList<>();
            this.counter = new AnimalCounter();
        }

        public void getNewAnimal(){
            String data = chooseAnimal();
            setAnimal(numFromUserData(data));
            counter.addAnimal();
        }

        public ArrayList<Animal> getAnimals(){return this.yourAnimals;}

        private String setName(){
            Scanner sc = new Scanner(System.in);
            String name;
            System.out.println("Дай животному имя");
            name = sc.nextLine();
            if(name.isEmpty()){
                System.out.println("Имя не может быть пустым, дай животному имя, или я назову его сама");
                name = sc.nextLine();
                if(name.isEmpty()){
                    name = "Пампушка";
                }
            }
            return name;
        }

        private String chooseAnimal(){
            Scanner sc = new Scanner(System.in);
            String animalNum;
            System.out.println("""
                    Какое животное вы хотите завести?
                    1 - Кошка
                    2 - Собака
                    3 - Лошадь
                    4 - Осёл""");
            animalNum = sc.nextLine();
            return animalNum;
        }

        private int numFromUserData(String userData){
            int userAnimal = 0;
            try{
                userAnimal = Integer.parseInt(userData);
            }catch (NumberFormatException e){
                System.out.println("Ой-ой, что-то пошло не так");
            }
            return userAnimal;
        }

    private boolean checkNum(int num){
        boolean flag = true;
        if(num < 1 || num > 4){
            System.out.println("Что-то пошло не так");
            flag = false;
        }
        return flag;
    }

        private void setAnimal(int userAnimal){
            if(checkNum(userAnimal)){
                switch (userAnimal) {
                    case 1 -> yourAnimals.add(new Cat(setName()));
                    case 2 -> yourAnimals.add(new Dog(setName()));
                    case 3 -> yourAnimals.add(new Horse(setName()));
                    default -> yourAnimals.add(new Donkey(setName()));
                }
            }else setAnimal(numFromUserData(chooseAnimal()));
        }

}
