import java.util.ArrayList;
import java.util.List;

public class BasePage {

    public static void main(String[] args){
        Owner ow1 = new Owner("Giovi");
        Owner ow2 = new Owner("Maria");
        //System.out.println(ow1);

        List<TestSuite> testSuiteList = new ArrayList<>();
        testSuiteList.add(new TestSuite("SUITE ONE"));
        testSuiteList.add(new TestSuite("SUITE TWO"));


        //2. Crear 5 Test Cases para cada test suite con su respectivo Owner y mostrar toda la Informacion por consola
        testSuiteList.get(0).setTestCaseList(FilterData.testCase("Test 01", 1, "Description 01", ow1));
        testSuiteList.get(0).setTestCaseList(FilterData.testCase("Test 02", 2, "Description 02", ow2));
        testSuiteList.get(0).setTestCaseList(FilterData.testCase("Test 03", 2, "Description 03", ow2));
        testSuiteList.get(0).setTestCaseList(FilterData.testCase("Test 04", 1, "Description 04", ow1));
        testSuiteList.get(0).setTestCaseList(FilterData.testCase("Test 05", 3, "Description 05", ow1));

        testSuiteList.get(1).setTestCaseList(FilterData.testCase("Test 06", 1, "Description 06", ow1));
        testSuiteList.get(1).setTestCaseList(FilterData.testCase("Test 07", 1, "Description 07", ow1));
        testSuiteList.get(1).setTestCaseList(FilterData.testCase("Test 08", 1, "Description 08", ow1));
        testSuiteList.get(1).setTestCaseList(FilterData.testCase("Test 09", 1, "Description 09", ow2));
        testSuiteList.get(1).setTestCaseList(FilterData.testCase("Test 10", 1, "Description 10", ow2));

        System.out.println("TEST CASES BY SUITE");
         FilterData.printDataTC(testSuiteList.get(0));
         FilterData.printDataTC(testSuiteList.get(1));

        //3) Mostrar solo los test cases que pertenescan aun solo owner( filtro por owner)+

        System.out.println("TEST CASES BY OWNER");
        FilterData.testFilterByOwner( testSuiteList.get(0),"Giovi");

        //4) Mostrar solo los test cases que sean de un tipo de prioridad (filtro por prioridad)
        System.out.println("TEST CASES BY PRIORITY");
        FilterData.testFilterByPriority(testSuiteList.get(0), 1);





    }

}
