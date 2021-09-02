package acadamy.learnprogramming.javacode;

public class JavaEmployee {

    private final String firstName;
    private final boolean fullTime;

    //This is a constructor
    public JavaEmployee(String firstName){
        this.firstName=firstName;
        this.fullTime=true;
    }

    //This is a constructor
    public JavaEmployee(String firstName, boolean fullTime){
        this.firstName=firstName;
        this.fullTime=fullTime;
    }


}
