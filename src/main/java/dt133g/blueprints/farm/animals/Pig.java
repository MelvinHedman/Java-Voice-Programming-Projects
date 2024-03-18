package dt133g.blueprints.farm.animals;

import dt133g.blueprints.farm.support.AnimalType;
import dt133g.blueprints.farm.support.AnimalSound;

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
        System.out.println(String.format("%s eats", getAnimalType()));
    }

    @Override
    public void sleep() {
        System.out.println(String.format("%s goes to sleep", getAnimalType()));
    }
}
