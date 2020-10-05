package be.intecbrussel.animals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();

    public AnimalShelter(){
    }
    public void printAnimals(){}
    public void sortAnimals(){
        
        animals.sort(Comparator.naturalOrder());
    }
    public void sortAnimalsByName(){

    animals.sort((animal1,animal2)->animal1.getName().compareTo(animal2.getName()));

    }
    public void sortAnimalsByAge(){}
    public void printAnimalsNotVaccinated(Disease disease){}
    public Animal findAnimal(int animalId){
        return null;
    }
    public Animal findAnimal(String animalName){
        return null;
    }
    public void treatAnimal(int animalId){}
    public void treatAnimal(String animalName){}
    public void treatAllAnimals(){}
    public Animal findOldestAnimal(){
        return null;}
    public int countAnimals(){
        return 0;
    }

}
