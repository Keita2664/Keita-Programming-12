import java.util.*;

public class Main {
    private DeckOfCards deckOfCards;
    public static void main(String[] args) {
        DeckOfCards deckOfCardFromTheClass = new DeckOfCards();
        List<Cards> polledCards = new ArrayList<>();

        LinkedList<Cards> deckOfCards = new LinkedList<>(deckOfCardFromTheClass.getArrayList());

        System.out.println("This is the deck of cards");
        for (int i = 0; i < deckOfCards.size(); i++){
            System.out.println(deckOfCards.get(i));
        }

        System.out.println("___________________");
        System.out.println("These are the 7 cards chosen");
        for (int i = 0; i < 7; i++){
            System.out.println(deckOfCards.pollLast());
        }
    }
}