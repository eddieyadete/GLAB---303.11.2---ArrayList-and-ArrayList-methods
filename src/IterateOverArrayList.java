import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {

    public void iterateOverArrayList() {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        System.out.println("\n=== Iterate using an iterator() ===");
//        Iterator<String> tvShowIterator = tvShows.iterator();
//        while(tvShowIterator.hasNext()) {
//            String tvShow = tvShowIterator.next();
//            System.out.println(tvShow);
//        }
//        System.out.println("\n=== Iterate using an Iterator() and forEachRemaining() method ===");
//        tvShowIterator = tvShows.iterator();
//        tvShowIterator.forEachRemaining(tvShow -> {
//            System.out.println(tvShow);
//        });
//
//        System.out.println("\n=== Iterate using simple for-each loop ===");
//        for(String tvShow : tvShows) {
//            System.out.println(tvShow);
//        }
//        System.out.println("\n=== Iterate using for loop with index ===");
//        for(int i = 0; i < tvShows.size(); i++){
//            System.out.println(tvShows.get(i));
//        }
        System.out.println("\n=== Iterate iterator ===");
        ListIterator iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");

        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }

    }
}
