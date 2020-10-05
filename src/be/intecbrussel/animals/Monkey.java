package be.intecbrussel.animals;

public class Monkey extends Animal{

    private boolean isHyperactive;

    public Monkey() {
    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperactive) {
        super(isClean, age, name, animalNumber);
        this.isHyperactive = isHyperactive;
    }

    @Override
    public void treatAnimal() {
        setHyperactive(false);
        setClean(true);
    }

    public boolean isHyperactive() {
        return isHyperactive;
    }

    public void setHyperactive(boolean hyperactive) {
        isHyperactive = hyperactive;
    }
}
