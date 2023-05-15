import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setUpTree();
        BFS();
    }

    private static void BFS() {
        // My code here

        //adding Queue the first number stored in graph
        Queue<Integer> integerQueue = new LinkedList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> explored = new ArrayList<>();
        integerQueue.add(graph.get(0).getKey());
        integerArrayList.add(graph.get(0).getKey());

        //get the nodes of the number stored in the "integerArrayList", which is storing the same information as "integer Queue"
        for (int i = 0; i < integerArrayList.size(); i++){
            for (int j = 0; j < graph.get(integerArrayList.get(i) - 1).getNodes().size(); j++){
                if (!integerQueue.contains(graph.get(integerArrayList.get(i) - 1).getNodes().get(j))){
                    integerQueue.add(graph.get(integerArrayList.get(i) - 1).getNodes().get(j));
                    integerArrayList.add(graph.get(integerArrayList.get(i) - 1).getNodes().get(j));
                }
            }
            //add the number to the "explored" arraylist once explored all the nodes of the number.
            explored.add(integerArrayList.get(i));
        }
        System.out.println(explored);

    }

    private static void setUpTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while (scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line){
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 1; i < keys.length; i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
