package blueprints.farm.animals;

import blueprints.farm.support.AnimalType;
import blueprints.farm.support.PHRASES;
import blueprints.farm.support.AnimalSound;

public class Pig extends Animal {
    public Pig() {
        super(AnimalType.PIG, AnimalSound.pigSound);
    }
    @Override
    public void makeSound() {
        System.out.println(AnimalSound.pigSound);
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
