package TD1_PF.arbres;

import java.util.Set;

public class Feuille implements Arbre{

    private int val;

    public Feuille(int parValeur){
        this.val=parValeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(Integer valeur) {
        return valeur.equals(this.val);
    }

    @Override
    public Set<Integer> valeurs() {
        return Set.of(this.val);
    }

    @Override
    public Integer somme() {
        return this.val;
    }

    @Override
    public Integer min() {
        return this.val;
    }

    @Override
    public Integer max() {
        return this.val;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
    
}
