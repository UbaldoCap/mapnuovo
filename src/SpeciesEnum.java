public enum SpeciesEnum {
    MAMMIFERI ("mammifero"),
    ANFIBI ("anfibio"),
    RETTILI ("rettile"),
    PESCI ("pesce"),
    UCCELLI ("uccello");
    private final String descrizione;

    SpeciesEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
