import java.util.Comparator;

public class SortsByNumericalValue implements Comparator<Cards>{

    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1.getNumbers() < o2.getNumbers()){
            return -1;
        }
        else if (o1.getNumbers() > o2.getNumbers()){
            return 1;
        }
        return 0;
    }
}
