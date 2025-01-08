import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public void test() {
        Helmet h = new Helmet("Gold");
        assertEquals(1.5, h.getWeight(), .1);
        Gauntlets g = new Gauntlets();
        assertEquals(0,g.getEquipmentID());
        Gloves gl = new Gloves("Rare", "The Force", true, 50, 1500, 10);
        assertEquals(1500, gl.getGloveCost());
        Boots b = new Boots(boolean uncomfortableBoots, String typeOfBoot, boolean bootWithShoelaces);
        assertEquals(0,b.getRevisedStrength());
        BodyArmor ba = new BodyArmor();
        assertEquals(0,ba.getMaterial());
        Shield s = new Shield();
        assertEquals(0,s.getDexMod());
        Role r = new Role();
        assertEquals(200,r.getChaMod());
        Species se = new Species();
        assertEquals(0,se.)
    

    }
}
