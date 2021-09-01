package acadamy.learnprogramming.javacode;

public class DummyClass {

    public String isVacationTime(Boolean onVacation){
        return onVacation ? "I am on vacation!" : "I am working!";
    }

    public void printNumbers(int[] numbers){
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
