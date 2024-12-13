import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public void addingElementFromAnother() {
        List<String> topCompanies = new ArrayList<>();
        //check if an ArrayLIst is empty
        System.out.println("is the topCompanies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Find the size of an arrayList
        System.out.println("here are the top " + topCompanies.size() + " companies in the world" );
        System.out.println(topCompanies);

        //Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() -1);


        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        //modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top list: " + topCompanies);

        topCompanies.add(5,"Facebook");
        System.out.println("Modified top list: " + topCompanies);

    }
}
