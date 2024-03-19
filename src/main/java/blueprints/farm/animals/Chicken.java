package blueprints.farm.animals;

import blueprints.farm.support.AnimalSound;
import blueprints.farm.support.AnimalType;
import blueprints.farm.support.PHRASES;

public class Chicken extends Animal {
    public Chicken() {
        super(AnimalType.CHICKEN, AnimalSound.chickenSound);
    }

    @Override
    public void makeSound() {
        System.out.println(AnimalSound.chickenSound);
    }

    @Override
    public void eat() {
        System.out.println(String.format(PHRASES.animalEats, getAnimalType()));
    }

    @Override
    public void sleep() {
        System.out.println(String.format(PHRASES.animalSleeps, getAnimalType()));
    }
}
