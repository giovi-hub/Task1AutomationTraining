import java.util.ArrayList;
import java.util.List;

public class TestCase {

    private String title;
    private  int priority;
    private String description;
    private List < String> steps ;
    private String expectedResult;
    private String status;
    private Owner owner;

    public TestCase(String title, int priority, String description){
        this.title = title;
        this.priority = priority;
        this.description = description;
        steps = new ArrayList<>();


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSteps() {
        return steps;
    }

  /*  public void setSteps(String steps) {
        this.steps = steps;
    }*/

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString(){
        return title+" "+priority+" "+description;
    }

    public void addTheSteps(String step){
        steps.add(step);
    }
}
