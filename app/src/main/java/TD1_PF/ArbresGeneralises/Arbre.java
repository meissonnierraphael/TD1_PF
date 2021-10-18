package TD1_PF.ArbresGeneralises;

import java.util.Set;

public interface Arbre<T> {
    int taille();
    boolean contient(T val);
    Set<T> valeurs();
}
