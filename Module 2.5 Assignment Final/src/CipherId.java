import com.sun.jdi.IntegerValue;

import java.util.Objects;
import java.util.Random;

public class CipherId {
    String id;

    CipherId(){
        Random random = new Random();
        int minValue = 1;
        int maxValue = 100;
        int randomId = random.nextInt(maxValue - minValue) + minValue;
        id = Integer.toString(randomId);
    }

    public int hashCode(){
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CipherId){
            CipherId other = (CipherId) o;
            if (this.id.equals(other.id)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "id-" + id;
    }
}
