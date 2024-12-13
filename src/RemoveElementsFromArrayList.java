import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RemoveElementsFromArrayList {

    public void RemoveElementsFromArrayLists() {
        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");


        ListIterator<String> iterator = programmingLanguages.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            break;
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());

//        for(int i = 0; i < programmingLanguages.size(); i++){
//        System.out.println(programmingLanguages.get(i));

//        Iterator<String> names = programmingLanguages.iterator();
//        while(names.hasNext()){
//            String programmingLanguage = names.next();
//            System.out.println("while: "+ programmingLanguage);
//        }
//        for(String programmingLanguage : programmingLanguages){
//            System.out.println("language: " + programmingLanguage);}

            System.out.println("Initial List: " + programmingLanguages);

            // Remove the element at index `5`
            programmingLanguages.remove(5);
            System.out.println("After remove(5): " + programmingLanguages);


//        Remove the first occurrence of the given element from the ArrayList
//         the remove() method returns false if the element doesnt exist in the arrayList)

            boolean isRemoved = programmingLanguages.remove("Kotlin");
            System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

            // Remove all the elements that exist in a given collection
            List<String> scriptingLanguages = new ArrayList<>();
            scriptingLanguages.add("Python");
            scriptingLanguages.add("Ruby");
            scriptingLanguages.add("Perl");

            programmingLanguages.removeAll(scriptingLanguages);
            System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

            // Remove all elements from the ArrayList
            programmingLanguages.clear();
            System.out.println("After clear(): " + programmingLanguages);
        }

    }}

