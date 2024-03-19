package dt133g.blueprints.farm.animals;

import dt133g.blueprints.farm.support.AnimalType;
import dt133g.blueprints.farm.support.PHRASES;

public abstract class Animal {
    private final String sound;
    private final AnimalType animalType;
    public Animal(AnimalType animalType, String sound){
        this.animalType = animalType;
        this.sound = sound;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();

    public String getSound() {
        return sound;
    }

    public AnimalType getAnimalType(){
        return animalType;
    }

    @Override
    public String toString() {
        return String.format(PHRASES.animalSays, animalType, sound);
    }
}
