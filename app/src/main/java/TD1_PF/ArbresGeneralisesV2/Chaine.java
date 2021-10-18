package TD1_PF.ArbresGeneralisesV2;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine>{

    private String machaine;

    public Chaine(String val){
        this.machaine=val;
    }

    public String valeur() {
        return this.machaine;
    }

    @Override
    public Chaine sommer(Chaine val) {
        return new Chaine(this.machaine+val.valeur());
    }

    @Override
    public int compareTo(Chaine o) {
        return this.machaine.compareTo(o.valeur());
    }
}
