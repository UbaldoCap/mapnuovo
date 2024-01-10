import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Parco {
    private ArrayList<Animal> animals;
    private HashMap<Integer, Animal> animalHashMap;

    private HashSet<Animal> animalHashSet;

    public Parco() {
        this.animals = new ArrayList<>();
        this.animalHashMap = new HashMap<>();
        this.animalHashSet = new HashSet<>();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }


    public HashMap<Integer, Animal> getAnimalHashMap() {
        return animalHashMap;
    }

    public HashSet<Animal> getAnimalHashSet() {
        return animalHashSet;
    }

    public void aggiungiAnimale(Animal animal) {
        if (animals.contains(animal)) {
            throw new RuntimeException("ATTENZIONE animale già presente");
        } else {
            System.out.println("animale aggiunto correttamente");
            animals.add(animal);
        }
    }

    public void rimuoviAnimale(Animal animal) {
        if (animals.contains(animal)) {
            System.out.println("animale rimosso con successo");
            animals.remove(animal);
        } else {
            throw new RuntimeException("ATTENZIONE animale non presente");
        }
    }

    public void stampaDettagli() {
        for (Animal animal : animals) {
            animal.stampaDettagli();
        }
    }

    public void aggiungiAnimaleMap(Animal animal) {
        if (animalHashMap.isEmpty()) {
            animalHashMap.put(animal.getId(), animal);
        } else if (!animalHashMap.containsKey(animal.getId())) {
            System.out.println("animale aggiunto correttamente");
            animalHashMap.put(animal.getId(), animal);
        } else {
            throw new RuntimeException("ATTENZIONE animale già presente");
        }
    }

    public void stampaDettagliMap() {
        for (Map.Entry<Integer, Animal> entry : animalHashMap.entrySet()) {
            System.out.print("ID = " + entry.getKey() + " | ");
            entry.getValue().stampaDettagli();
        }
    }

    public void aggiungianimaleSet(Animal animal) {
        boolean isSpecieNonPresente = false;
        if (animalHashSet.isEmpty()) {
            System.out.println("animale aggiunto correttamente");
            animalHashSet.add(animal);
        } else {
            for (Animal animal1 : animalHashSet) {
                if (animal.getSpecies().equals(animal1.getSpecies())) {
                    throw new RuntimeException("specie già presente");
                } else {
                    isSpecieNonPresente = true;
                }
            }
        }
        if (isSpecieNonPresente) {
            System.out.println("animale aggiunto correttamente");
            animalHashSet.add(animal);
        }
    }

    public void stampaDettagliSet() {
        for (Animal animal : animalHashSet) {
            animal.stampaDettagli();
        }
    }
}
