import org.junit.Assert;
import org.junit.Test;

public class OwnerTest {

    @Test
    public void VerifyName(){
        Owner ow1 = new Owner("Giovi");
        Assert.assertEquals(ow1.getName(),"Giovi");
    }
    @Test
    public void VerifyRole(){
        Owner ow2 = new Owner("MARIA");
        ow2.setRole("Guest");
        Assert.assertEquals(ow2.getRole(),"Guest");
    }
}
