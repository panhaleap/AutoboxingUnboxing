import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("Hello");

        if(test.contains("hello")){
            System.out.println("Found");
        }

        //branches.forEach((branch) -> System.out.println(branch));

        test.forEach((t) -> System.out.println(t));
    }
}
