import org.junit.Assert;
import org.junit.Test;

public class TestCasesTest {
    @Test
     public void CreateTC(){
        String title = "TestONE";
        int priority = 1;
        String desc = "DESCRIPTION1";
        TestCase testC2 = new TestCase(title,priority, desc);
        testC2.setOwner(new Owner("MARIA"));
        testC2.addTheSteps("1. Step ONE");
        testC2.addTheSteps("2. Step TWO");
        testC2.addTheSteps("3. Step THREE");
        testC2.setExpectedResult("Expected Result ABC");
       /* System.out.println(testC2.getTitle());
        System.out.println(testC2.getPriority());
        System.out.println(testC2.getDescription());
        System.out.println(testC2.getOwner().getName());
        System.out.println(testC2.getSteps().get(0));
        System.out.println(testC2.getSteps().get(1));
        System.out.println(testC2.getSteps().get(2));
        System.out.println(testC2.getExpectedResult());*/
        Assert.assertEquals(testC2.getTitle(),"TestONE" );
    }


}
