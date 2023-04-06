import java.util.Comparator;

public class SortsBySuits implements Comparator<Cards> {

    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1.getSymbols().ordinal() > o2.getSymbols().ordinal()){
            return -1;
        }
        else if (o1.getSymbols().ordinal() < o2.getSymbols().ordinal()){
            return 1;
        }
        return 0;
    }
}