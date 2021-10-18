package TD1_PF.ArbresGeneralisesV2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T> implements Arbre<T>{

    private List<Arbre<T>> maList;

    public Noeud(List<Arbre<T>> list) {
        this.maList=list;
    }

    @Override
    public int taille() {
        int taille=0;
        for(Arbre<T> a : maList){
            taille+=a.taille();
        }
        return taille;
    }

    @Override
    public boolean contient(T val) {
        boolean cnt = false;
        for(Arbre<T> a : maList){
            if(a.contient(val)){
                return true;
            }
        }
        return cnt;
    }

    /*@Override
    public Set<T> valeurs() {
        Set<T> monSet = new HashSet<>();
        for(Arbre<T> a : maList){
            monSet.addAll(a.valeurs());
        }
        return monSet;
    }*/
}
