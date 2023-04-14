import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class ByWords {
    String word;
//    int id;

    public ByWords(String word){
        this.word = word;
//        this.id = id;
    }

//    public int hashCode(){
//        return id;
//    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ByWords){
            ByWords other = (ByWords) o;
            if (this.word.equals(other.word)) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return word;
    }
}
