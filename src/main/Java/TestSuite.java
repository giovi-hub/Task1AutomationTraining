import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private List<TestCase> testCaseList;
    private String suiteName;

    public TestSuite(String suiteN){
        this.suiteName = suiteN;
        testCaseList = new ArrayList<>();
    }

    public List<TestCase> getTestCaseList() {
                return testCaseList;
    }

    public void setTestCaseList(TestCase testCase) {
        testCaseList.add(testCase);
    }

    public String getSuiteName() {
        return suiteName;
    }

    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }
    public String toString(){
        return suiteName;
    }
}

