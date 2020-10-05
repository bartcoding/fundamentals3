package be.intecbrussel.animals;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog() {
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        setHasFoulBreath(false);
        setClean(true);
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }
}
