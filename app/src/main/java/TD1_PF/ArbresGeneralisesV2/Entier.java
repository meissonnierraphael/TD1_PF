package TD1_PF.ArbresGeneralisesV2;

public class Entier implements Sommable<Entier>{
    private Integer val;

    public Entier(int valeur) {
        this.val = valeur;
    }

    public int valeur() {
        return this.val;
    }

    @Override
    public Entier sommer(Entier parVal) {
        return new Entier(this.valeur() + parVal.valeur());
    }
}
