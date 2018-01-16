import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeichleTest {

    ArmyVeichle armyVeichle;
    NavyVeichle navyVeichle;

    @Before
    public void before() {
        armyVeichle = new ArmyVeichle("Battle Tank", 600);
        navyVeichle = new NavyVeichle("Atomic Cruiser", 1100);
    }

    @Test
    public void armyVeichleHasaType() {
        assertEquals("Battle Tank", armyVeichle.gettype());
    }

    @Test
    public void navyVeichleHasaType() {
        assertEquals("Atomic Cruiser", navyVeichle.gettype());
    }

    @Test
    public void armyVeichleHasHealthValue() {
        assertEquals(600, armyVeichle.getHealth());
    }

    @Test
    public void navyVeichleHasHealthValue() {
        assertEquals(1100, navyVeichle.getHealth());
    }


}
