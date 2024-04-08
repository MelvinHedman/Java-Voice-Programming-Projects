package blueprints.farm.animals;

import blueprints.farm.support.ANIMALTYPE;
import blueprints.farm.support.PHRASES;

public abstract class Animal {
    private final String sound;
    private final ANIMALTYPE animalType;
    public Animal(ANIMALTYPE animalType, String sound){
        this.animalType = animalType;
        this.sound = sound;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();

    public String getSound() {
        return sound;
    }

    public ANIMALTYPE getAnimalType(){
        return animalType;
    }

    @Override
    public String toString() {
        return String.format(PHRASES.animalSays, animalType, sound);
    }
}
