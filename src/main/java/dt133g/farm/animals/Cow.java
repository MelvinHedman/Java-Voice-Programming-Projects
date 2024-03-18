package dt133g.farm.animals;

import dt133g.farm.support.AnimalSound;
import dt133g.farm.support.AnimalType;

public class Cow extends Animal {
    public Cow() {
        super(AnimalType.COW, AnimalSound.cowSound);
    }

    @Override
    public void sleep() {
        System.out.println(String.format("%s goes to Sleep", getAnimalType()));
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s eats", getAnimalType()));
    }
    @Override
    public void makeSound() {
        System.out.println(AnimalSound.cowSound);
    }


}
