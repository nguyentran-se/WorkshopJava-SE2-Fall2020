
import java.util.Comparator;

public class SortByPrice implements Comparator<Tour>{

    @Override
    public int compare(Tour t1, Tour t2) {
        return Double.valueOf(t2.getPrice()).compareTo(t1.getPrice());
    }

}
