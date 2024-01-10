public class Main {
    public static void main(String[] args) {
        try {
            Parco parco = new Parco();
            Animal animal1 = new Animal("gatto", SpeciesEnum.MAMMIFERI);
            Animal animal2 = new Animal("cane", SpeciesEnum.MAMMIFERI);
            Animal animal3 = new Animal("serpente", SpeciesEnum.RETTILI);
            parco.aggiungiAnimale(animal1);
            parco.aggiungiAnimale(animal2);
            parco.aggiungiAnimale(animal3);
            parco.stampaDettagli();
            parco.aggiungiAnimaleMap(animal1);
            parco.aggiungiAnimaleMap(animal2);
            parco.aggiungiAnimaleMap(animal3);
            parco.stampaDettagliMap();
            parco.aggiungianimaleSet(animal1);
            parco.aggiungianimaleSet(animal3);
            parco.stampaDettagliSet();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
