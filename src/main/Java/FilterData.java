
import java.util.List;

public class FilterData {


    public static TestCase testCase(String title, int priority, String description, Owner owner){
       TestCase tc = new TestCase(title,priority, description);
        tc.setTitle(title);
        tc.setPriority(priority);
        tc.setOwner(owner);
        return tc;

    }

    public static void printDataTC(TestSuite tsuit){
        System.out.println(tsuit.getSuiteName());
        for (TestCase testcase: tsuit.getTestCaseList()
             ) {
            System.out.println(testcase.getTitle());
            System.out.println(testcase.getPriority());
            System.out.println(testcase.getDescription());

        }
    }


    public static void testFilterByOwner(TestSuite tsuit, String owner){
        System.out.println("by owner");

       // System.out.println(tsuit.getSuiteName());

        for (TestCase testcase: tsuit.getTestCaseList()
             ) {
            if (testcase.getOwner().getName().equals(owner)){
                System.out.println(testcase.getTitle());
                System.out.println(testcase.getPriority());
                System.out.println(testcase.getDescription());
            }

        }


    }


    public static void testFilterByPriority(TestSuite tsuit, int priority){

        System.out.println("BY PRIORITY");

       // System.out.println(tsuit.getTestCaseList().size());
        int i= 0;
        while (i < tsuit.getTestCaseList().size()){
            if (tsuit.getTestCaseList().get(i).getPriority()== priority){
                System.out.println(tsuit.getTestCaseList().get(i).getTitle());
                System.out.println(tsuit.getTestCaseList().get(i).getPriority());

            }i++;
        }


    }
}
