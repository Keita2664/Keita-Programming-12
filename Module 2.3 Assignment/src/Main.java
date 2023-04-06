import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private DeckOfCards deckOfCards;
    public static void main(String[] args) {
        DeckOfCards deckOfCardFromTheClass = new DeckOfCards();
        List<Cards> polledCards = new ArrayList<>();

        LinkedList<Cards> deckOfCards = new LinkedList<>(deckOfCardFromTheClass.getArrayList());
//        ArrayList<Cards> deckOfCards1 = new ArrayList<>(deckOfCardFromTheClass.getArrayList());

        System.out.println("Spade ordinal: " + Symbols.SPADES.ordinal());
        System.out.println("Diamond ordinal: " + Symbols.DIAMONDS.ordinal());
        System.out.println("Hearts ordinal: " + Symbols.HEARTS.ordinal());
        System.out.println("Clubs ordinal: " + Symbols.CLUBS.ordinal());

        System.out.println("This is the deck of cards");
        for (int i = 0; i < deckOfCards.size(); i++){
            System.out.println(deckOfCards.get(i));
        }


        Collections.sort(deckOfCards);
        System.out.println(" ");
        System.out.println("**********SORTED BY SUITS**********");
        for (Cards cards : deckOfCards){
            System.out.println(cards);
        }

        System.out.println(" ");
        System.out.println("**********SORTED BY ASCENDING NUMBER**********");
        SortsByNumericalValue byNumericalValue = new SortsByNumericalValue();
        Collections.sort(deckOfCards,byNumericalValue);
        for (Cards cards: deckOfCards){
            System.out.println(cards);
        }



        /*
        System.out.println(" ");
        System.out.println("**********DESCENDING ORDER**********");
        SortsByNumericalValue orderedBYNum = new SortsByNumericalValue();
        Collections.sort(deckOfCardFromTheClass.getArrayList(),orderedBYNum);
        for (Cards cards: deckOfCardFromTheClass.getArrayList()){
            System.out.println(cards);
        }

         */

        /*
        Collections.sort(deckOfCardFromTheClass.getArrayList());
        System.out.println(" ");
        System.out.println("**********SORTED BY SUITS**********");
        for (Cards cards: deckOfCardFromTheClass.getArrayList()){
            System.out.println(cards);
        }

         */


        System.out.println("___________________");
        System.out.println("These are the 7 cards chosen");
        for (int i = 0; i < 7; i++){
            System.out.println(deckOfCards.pollLast());
        }

    }
}