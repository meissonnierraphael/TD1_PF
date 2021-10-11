/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TD1_PF;

import org.junit.Test;
import static org.junit.Assert.*;

import TD1_PF.arbres.Arbre;
import TD1_PF.arbres.Feuille;
import TD1_PF.arbres.Noeud;

import java.util.List;

public class AppTest {

    public static final Arbre Test_arbre1(){
        Arbre f1 =new Feuille(1);
        Arbre f2 =new Feuille(2);
        Arbre f3 =new Feuille(3);
        Arbre n1 = new Noeud(List.of(f1,f2));
        Arbre n2 = new Noeud(List.of(n1,f3));
        return n2;
    }
}
