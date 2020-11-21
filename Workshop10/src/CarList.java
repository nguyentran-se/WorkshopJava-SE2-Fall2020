
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CarList<T> {

    private LinkedList<T> a = new LinkedList<>();

    public void addItem(T t) {
        a.add(t);
    }
    
    public void displayItems(){
        for (T t : a) {
            System.out.println(t);
        }
    }
    
    public int getSize(){
        return a.size();
    }
    
    public boolean checkEmpty(){
        return a.isEmpty();
    }
    
    public void delete(int pos){
        a.remove(pos);
    }
    
    public void sort(){
        Comparator<T> byPrice = new Comparator<T>() {
            @Override
            public int compare(T t1, T t2) {
                return Double.compare(((Car) t2).getPrice(), ((Car) t1).getPrice());
            }
        };
        Collections.sort(a, byPrice);
    }
    
    public boolean search(Car c){
        for (T t : a) {
            if(c.equals(t)){
                return true;
            }
        }
        return false;
    }
}
