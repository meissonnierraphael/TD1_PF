package TD1_PF.ArbresGeneralisesV2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T> & Comparable> implements Arbre<T>{

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

    @Override
    public Set<T> valeurs() {
        Set<T> monSet = new HashSet<>();
        for(Arbre<T> a : maList){
            monSet.addAll(a.valeurs());
        }
        return monSet;
    }

    @Override
    public T somme() {
        if (maList == null || maList.size() == 0)
            return null;
        T sm = maList.get(0).somme();
        for (int i = 1; i<maList.size(); i++) {
            sm = (T) sm.sommer(maList.get(i).somme());
        }
        return sm;
    }

    @Override
    public T min() {
        if (maList == null || maList.size() == 0)
            return null;
        T valMin = maList.get(0).min();
        for (int i = 1; i<maList.size(); i++) {
            T tmp = maList.get(i).min();
            if (tmp.compareTo(valMin) < 0) {
                valMin = tmp;
            }
        }
        return valMin;
    }

    @Override
    public T max() {
        if (maList == null || maList.size() == 0)
            return null;
        T valMax = maList.get(0).min();
        for (int i = 1; i<maList.size(); i++) {
            T tmp = maList.get(i).min();
            if (tmp.compareTo(valMax) > 0) {
                valMax = tmp;
            }
        }
        return valMax;
    }

    @Override
    public Boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < maList.size() - 1; i++) {
            Arbre<T> fi = maList.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < maList.size() - 1; i++) {
            Arbre<T> fi = maList.get(i);
            Arbre<T> fj = maList.get(i+1);
            if (fi.max().compareTo(fj.min()) > 0)
                return false;
        }
        return rtr;
    }
}
