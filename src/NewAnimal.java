import AnimalFarm.Cat;
import AnimalFarm.Dog;
import AnimalFarm.Donkey;
import AnimalFarm.Horse;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAnimal {
        ArrayList<String> yourAnimals;
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

        private void setAnimal(int userAnimal){
            switch (userAnimal) {
                case 1 -> yourAnimals.add(new Cat(setName()).toString());
                case 2 -> yourAnimals.add(new Dog(setName()).toString());
                case 3 -> yourAnimals.add(new Horse(setName()).toString());
                default -> yourAnimals.add(new Donkey(setName()).toString());
            }
        }

}