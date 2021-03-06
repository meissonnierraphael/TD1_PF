/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TD1_PF;

import static org.junit.Assert.*;

import TD1_PF.ArbresGeneralisesV2.*;
import org.junit.Test;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppTest {

    @Test
    public final void Test_valeurs_arbre2(){

        Entier a = new Entier(4);
        Entier b = new Entier(5);
        Set<Entier> test = Set.of(a,b);
        Arbre<Entier> n1 =new Noeud<>(List.of(new Feuille<>(a),new Feuille<>(b)));
        assertEquals(n1.valeurs(),test);

    }

    @Test
    public final void Test_contient_arbre2(){

        Entier e1 = new Entier(4);
        Arbre<Entier> v =new Feuille<>(e1);
        assertEquals(v.contient(e1),true);

        Chaine c1 = new Chaine("quatre");
        Arbre<Chaine> v2 =new Feuille<>(c1);
        assertEquals(v2.contient(c1),true);
    }

    @Test
    public final void Test_taille_arbre2(){
        Arbre<Entier> v =new Feuille<>(new Entier(4));
        assertEquals(v.taille(),1);

        Arbre<Chaine> v2 =new Feuille<>(new Chaine("quatre"));
        assertEquals(v2.taille(),1);
    }

    /*@Test
    public final void Test_sommer_arbre3(){

        Sommable<Entier> e = new Entier(1);
        Sommable<Entier> e2 = e.sommer(new Entier(1));
        assertEquals(e2,2);
    }*/

}
