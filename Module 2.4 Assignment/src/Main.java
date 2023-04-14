import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        String[] strings;

        Scanner scanner = new Scanner(new File("C:/Users/kojim/Documents/Programming 12 Text/illiad.txt"));
        while (scanner.hasNext()){
            String allLowerCased = scanner.nextLine().toLowerCase().replace("," ,"").replace(";", "").replace(".", "").replace(":","");
            System.out.println(allLowerCased);

            strings = allLowerCased.split(" ");

            for (int i = 0; i < strings.length; i++){
                words.add(strings[i]);
            }

        }

        System.out.println("Number of Words in Iliad Text: " + words.size());
    }
}

