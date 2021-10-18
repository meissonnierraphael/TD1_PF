package TD1_PF.ArbresGeneralisesV2;

import java.util.Set;

public class Feuille<T extends Sommable<T> & Comparable> implements Arbre<T> {

    private T val;

    public Feuille(T val){
        this.val=val;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(T val) {
        return val.equals(this.val);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(this.val);
    }

    @Override
    public T somme() {
        return this.val;
    }

    @Override
    public T min() {
        return this.val;
    }

    @Override
    public T max() {
        return this.val;
    }

    @Override
    public Boolean estTrie() {
        return true;
    }
}
