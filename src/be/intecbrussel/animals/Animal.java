package be.intecbrussel.animals;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable,Treatable,Comparable{

    private Map<Disease, Boolean> isVaccinated = new HashMap<>();
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal(){
        fillVaccinationMap();
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
        fillVaccinationMap();
    }
    private void fillVaccinationMap(){
        for (Disease disease:Disease.values()) {
            isVaccinated.put(disease,false);
        }
    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease,true);
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }
}
