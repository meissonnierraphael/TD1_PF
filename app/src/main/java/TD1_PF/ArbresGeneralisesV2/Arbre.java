package TD1_PF.ArbresGeneralisesV2;

import java.util.Set;

public interface Arbre<T extends Sommable> {
    int taille();
    boolean contient(T val);
    Set<T> valeurs();
    T somme();
    T min();
    T max();
    Boolean estTrie();
}
