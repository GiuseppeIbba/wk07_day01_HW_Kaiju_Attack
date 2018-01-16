import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {


    GodzillaKaiju godzilla;
    GhidorahKaiju ghidorah;
    ArmyVeichle armyVeichle;


    @Before
    public void before() {
        godzilla = new GodzillaKaiju("Godzilla", 800, 100);
        ghidorah = new GhidorahKaiju("Ghidorah", 1000, 80);
    }

    @Test
    public void godzillaHasAName() {
        assertEquals("Godzilla", godzilla.getName());
    }


    @Test
    public void ghidorahHasAName() {
        assertEquals("Ghidorah", ghidorah.getName());
    }

    @Test
    public void godzillaHasHealthValue() {
        assertEquals(800, godzilla.getHealth());
    }

    @Test
    public void ghidoraHasHealthValue() {
        assertEquals(1000, ghidorah.getHealth());
    }

    @Test
    public void godzillaHasAttackValue() {
        assertEquals(100, godzilla.getAttack());
    }

    @Test
    public void ghidorahHasAttackValue() {
        assertEquals(80, ghidorah.getAttack());
    }


//    @Test
//    public void godzillaCanRoar() {
//        assertEquals("BRWWWWAAAAA, GODZILLA DESTROY STUFF!", godzilla.roar());
//    }
//
//    @Test
//    public void ghidorahCanRoar() {
//        assertEquals("BRWWWWAAAA, GHIDORA ANGRY!", ghidorah.roar());
//    }

    @Test
    public void godzillaCanRoar() {
        assertEquals("GODZILLA DESTROY STUFF! ROOOOAR", godzilla.roar("ROOOOAR"));
    }


    @Test
    public void ghidorahCanRoar() {
        assertEquals("ROOOOAR, GHIDORAH ANGRY!", ghidorah.roar("ROOOOAR"));
    }

    @Test
    public void godzillaCanAttack() {
        armyVeichle = new ArmyVeichle("Eva-02", 4000);
        godzilla.attackVeichle(armyVeichle);
        assertEquals(3900, armyVeichle.healthValue);
    }

}