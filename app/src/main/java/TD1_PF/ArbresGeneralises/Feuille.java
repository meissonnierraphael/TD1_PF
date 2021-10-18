package TD1_PF.ArbresGeneralises;

import java.util.Set;

public class Feuille<T> implements Arbre<T> {

    private T val;

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
}
