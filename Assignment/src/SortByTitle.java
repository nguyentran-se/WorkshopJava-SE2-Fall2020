
import java.util.Comparator;

public class SortByTitle implements Comparator<Tour>{

    @Override
    public int compare(Tour t1, Tour t2) {
        return t1.getTitle().compareTo(t2.getTitle());
    }

}
