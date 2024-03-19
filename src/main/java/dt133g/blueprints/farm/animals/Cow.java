package dt133g.blueprints.farm.animals;

import dt133g.blueprints.farm.support.AnimalType;
import dt133g.blueprints.farm.support.AnimalSound;
import dt133g.blueprints.farm.support.PHRASES;

public class Cow extends Animal {
    public Cow() {
        super(AnimalType.COW, AnimalSound.cowSound);
    }

    @Override
    public void sleep() {
        System.out.println(String.format(PHRASES.animalSleeps, getAnimalType()));
    }

    @Override
    public void eat() {
        System.out.println(String.format(PHRASES.animalEats, getAnimalType()));
    }
    @Override
    public void makeSound() {
        System.out.println(AnimalSound.cowSound);
    }


}
