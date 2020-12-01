
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TourComparator implements Comparator<Tour>{

    private List<Comparator<Tour>> listComparators;
    
    public TourComparator(Comparator<Tour>... comparator){
        this.listComparators = Arrays.asList(comparator);
    }
    @Override
    public int compare(Tour t1, Tour t2) {
        for(Comparator<Tour> comparator : listComparators){
           int result = comparator.compare(t1, t2);
           if(result != 0) return result;
        }
        return 0;

    }
}
