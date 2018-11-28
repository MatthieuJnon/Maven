import model.Ville;
import org.junit.Assert;
import org.junit.Test;

public class VilleTest {

    @Test
    public void constructorTest(){
        Ville ville = new Ville();
        ville.setNom("test");
        Assert.assertEquals("test", ville.getNom());
    }

    @Test
    public void trueTest(){
        Assert.assertTrue(true);
    }
}
