package TD1_PF.arbres;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre{
    private List<Arbre> maList;

    public Noeud(List<Arbre> parList){
        this.maList=parList;
    }
    @Override
    public int taille() {
        int taille=0;
        for(Arbre a : maList){
            taille+=a.taille();
        }
        return taille;
    }

    @Override
    public boolean contient(Integer val) {
        boolean cnt = false;
        for(Arbre a : maList){
            if(a.contient(val)){
                return true;
            }
        }
        return cnt;
    }

    @Override
    public Set<Integer> valeurs() {
        Set<Integer> monSet = new HashSet<>();
        for(Arbre a : maList){
            monSet.addAll(a.valeurs());
        }
        return monSet;
    }

    @Override
    public Integer somme() {
        int cpt=0;
        for(Arbre a : maList){
            cpt+=a.somme();
        }
        return cpt;
    }

    @Override
    public Integer min() {
        int m=maList.get(0).min();
        for(int i=0; i<maList.size();i++){
            int min=maList.get(i).min();
            if(min<m){
                m=min;
            }
        }
        return m;
    }

    @Override
    public Integer max() {
        int m=maList.get(0).max();
        for(int i=0; i<maList.size();i++){
            int max=maList.get(i).max();
            if(max<m){
                m=max;
            }
        }
        return m;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
