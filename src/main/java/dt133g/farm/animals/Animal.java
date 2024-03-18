package dt133g.farm.animals;

import dt133g.farm.support.AnimalType;

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
        return String.format("%s says %s", animalType, sound);
    }
}
