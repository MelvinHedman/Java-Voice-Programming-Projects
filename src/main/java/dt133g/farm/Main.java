package dt133g.farm;

import dt133g.farm.animals.Chicken;
import dt133g.farm.animals.Cow;
import dt133g.farm.animals.Pig;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.sleep();
        cow.makeSound();

        System.out.println(cow.getSound());
        System.out.println(cow.getAnimalType());
        System.out.println(cow);

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.sleep();
        chicken.makeSound();

        System.out.println(cow.getSound());
        System.out.println(cow.getAnimalType());
        System.out.println(chicken);

        Pig pig = new Pig();
        pig.eat();
        pig.sleep();
        pig.makeSound();

        System.out.println(cow.getSound());
        System.out.println(cow.getAnimalType());
        System.out.println(pig);
    }
}

