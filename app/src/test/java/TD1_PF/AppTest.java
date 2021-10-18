/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TD1_PF;

import static org.junit.Assert.*;

import TD1_PF.ArbresGeneralisesV2.*;

import java.util.List;

public class AppTest {

    public static final void Test_arbre1(){
        Arbre f1 =new Feuille(1);
        Arbre f2 =new Feuille(2);
        Arbre f3 =new Feuille(3);
        Arbre n1 = new Noeud(List.of(f1,f2));
        Arbre n2 = new Noeud(List.of(n1,f3));
        assertEquals(n2.taille(),3);
    }

    /*public static final void Test_valeurs_arbre2(){
        Arbre<Entier> v =new Feuille<>(new Entier(4));
        assertEquals(v.contient(4),4);

        Arbre<Chaine> v2 =new Feuille<>(new Chaine("quatre"));
        assertEquals(v2.contient("quatre"),"quatre");
    }

    public static final void Test_contient_arbre2(){
        Arbre<Entier> v =new Feuille<>(new Entier(4));
        assertEquals(v.contient(4),4);

        Arbre<Chaine> v2 =new Feuille<>(new Chaine("quatre"));
        assertEquals(v2.contient("quatre"),"quatre");
    }*/

    public static final void Test_taille_arbre2(){
        Arbre<Entier> v =new Feuille<>(new Entier(4));
        assertEquals(v.taille(),1);

        Arbre<Chaine> v2 =new Feuille<>(new Chaine("quatre"));
        assertEquals(v2.taille(),1);
    }
}
