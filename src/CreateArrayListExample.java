import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

    public void ArrayListExamples() {
        //creating an ArrayLIs of Strings
        List<String> animals = new ArrayList();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);
        //adding an element at a patricular index in an ArrayLIst
        animals.add(2,"Elephant");
        System.out.println(animals);

    }

}
