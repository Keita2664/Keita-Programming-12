import java.util.ArrayList;

public class DeckOfCards{
    private int numberCards;
    private String faceCards;
    private Symbols symbolOfCards;
    private ArrayList<Cards> deckOfCards;

    public DeckOfCards(int numberCards, String faceCards, Symbols symbolOfCards){
        this.numberCards = numberCards;
        this.faceCards = faceCards;
        this.symbolOfCards = symbolOfCards;
    }

    public DeckOfCards(){
        deckOfCards = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            deckOfCards.add(new NumberCards(i + 1,Symbols.CLUBS));
            deckOfCards.add(new NumberCards(i + 1, Symbols.DIAMONDS));
            deckOfCards.add(new NumberCards(i + 1,Symbols.HEARTS));
            deckOfCards.add(new NumberCards(i + 1, Symbols.SPADES));
        }

        deckOfCards.add(new FaceCards("Jack", Symbols.CLUBS, 11));
        deckOfCards.add(new FaceCards("Jack", Symbols.DIAMONDS, 11));
        deckOfCards.add(new FaceCards("Jack", Symbols.HEARTS, 11));
        deckOfCards.add(new FaceCards("Jack", Symbols.SPADES, 11));
        deckOfCards.add(new FaceCards("Queen", Symbols.CLUBS, 12));
        deckOfCards.add(new FaceCards("Queen", Symbols.DIAMONDS, 12));
        deckOfCards.add(new FaceCards("Queen", Symbols.HEARTS, 12));
        deckOfCards.add(new FaceCards("Queen", Symbols.SPADES, 12));
        deckOfCards.add(new FaceCards("King", Symbols.CLUBS, 13));
        deckOfCards.add(new FaceCards("King", Symbols.DIAMONDS, 13));
        deckOfCards.add(new FaceCards("King", Symbols.HEARTS, 13));
        deckOfCards.add(new FaceCards("King", Symbols.SPADES, 13));
    }

    public ArrayList<Cards> getArrayList(){
        return deckOfCards;
    }

    public int getNumberCards() {
        return numberCards;
    }

    public void setNumberCards(int numberCards) {
        this.numberCards = numberCards;
    }

    public String getFaceCards() {
        return faceCards;
    }

    public void setFaceCards(String faceCards) {
        this.faceCards = faceCards;
    }

    public Symbols getSymbolOfCards() {
        return symbolOfCards;
    }

    public void setSymbolOfCards(Symbols symbolOfCards) {
        this.symbolOfCards = symbolOfCards;
    }
}
