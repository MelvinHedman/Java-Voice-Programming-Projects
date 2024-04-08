package blueprints.farm.animals;

import blueprints.farm.support.ANIMALTYPE;
import blueprints.farm.support.AnimalSound;
import blueprints.farm.support.PHRASES;

public class Cow extends Animal {
    public Cow() {
        super(ANIMALTYPE.COW, AnimalSound.cowSound);
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
