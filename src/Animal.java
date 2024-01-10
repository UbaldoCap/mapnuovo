import java.util.Objects;

public class Animal {
    private Integer id;
    private String name;
    private SpeciesEnum species;
    private static Integer counter = 1;

    public Animal(String name, SpeciesEnum species) {
        this.name = name;
        this.species = species;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpeciesEnum getSpecies() {
        return species;
    }

    public void setSpecies(SpeciesEnum species) {
        this.species = species;
    }

    public Integer getId() {
        return id;
    }

    public void stampaDettagli() {
        System.out.println("Nome = " + name + " | Specie = " + species.getDescrizione() + " | ID = " + getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species=" + species +
                '}';
    }
}
