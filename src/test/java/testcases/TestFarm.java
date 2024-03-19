package testcases;

import blueprints.farm.animals.Animal;
import blueprints.farm.animals.Chicken;
import blueprints.farm.animals.Cow;
import blueprints.farm.animals.Pig;
import blueprints.farm.support.AnimalSound;
import blueprints.farm.support.AnimalType;
import blueprints.farm.support.PHRASES;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class TestFarm {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    private void testAnimalSleep(Animal animal, AnimalType expectedType) {
        animal.sleep();
        String expectedMessage = String.format(PHRASES.animalSleeps, expectedType);
        Assertions.assertEquals(expectedMessage, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    private void testAnimalEat(Animal animal, AnimalType expectedType) {
        animal.eat();
        String expectedMessage = String.format(PHRASES.animalEats, expectedType);
        Assertions.assertEquals(expectedMessage, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    private void testAnimalMakeSound(Animal animal, AnimalType expectedType, String expectedSound) {
        animal.makeSound();
        Assertions.assertEquals(expectedSound, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    private void testAnimalGetSound(Animal animal, String expectedSound) {
        Assertions.assertEquals(expectedSound, animal.getSound());
    }

    private void testAnimalGetAnimalType(Animal animal, AnimalType expectedType) {
        Assertions.assertEquals(expectedType, animal.getAnimalType());
    }

    @Test
    public void TestAnimalSleep() {
        testAnimalSleep(new Cow(), AnimalType.COW);
        testAnimalSleep(new Chicken(), AnimalType.CHICKEN);
        testAnimalSleep(new Pig(), AnimalType.PIG);
    }

    @Test
    public void TestAnimalEat() {
        testAnimalEat(new Cow(), AnimalType.COW);
        testAnimalEat(new Chicken(), AnimalType.CHICKEN);
        testAnimalEat(new Pig(), AnimalType.PIG);
    }

    @Test
    public void TestAnimalMakeSound() {
        testAnimalMakeSound(new Cow(), AnimalType.COW, new Cow().getSound());
        testAnimalMakeSound(new Chicken(), AnimalType.CHICKEN, new Chicken().getSound());
        testAnimalMakeSound(new Pig(), AnimalType.PIG, new Pig().getSound());
    }

    @Test
    public void TestAnimalGetSound() {
        testAnimalGetSound(new Cow(), AnimalSound.cowSound);
        testAnimalGetSound(new Chicken(), AnimalSound.chickenSound);
        testAnimalGetSound(new Pig(), AnimalSound.pigSound);
    }


    @Test
    public void TestAnimalGetAnimalType() {
        testAnimalGetAnimalType(new Cow(), AnimalType.COW);
        testAnimalGetAnimalType(new Chicken(), AnimalType.CHICKEN);
        testAnimalGetAnimalType(new Pig(), AnimalType.PIG);
    }



}
