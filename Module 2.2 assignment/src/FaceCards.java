import java.util.ArrayList;

public class FaceCards extends Cards{
    private String faceOfCards;
    private Symbols symbolOfCards;

    public FaceCards(String faceOfCards, Symbols symbolOfCards){
        this.faceOfCards = faceOfCards;
        this.symbolOfCards = symbolOfCards;
    }

    public FaceCards(){
        faceOfCards = "none";
        symbolOfCards = Symbols.NONE;
    }

    public String getFaces() {
        return faceOfCards;
    }

    public void setFaces(String faces) {
        this.faceOfCards = faces;
    }

    public Symbols getSymbolOfCards() {
        return symbolOfCards;
    }

    public void setSymbolOfCards(Symbols symbolOfCards) {
        this.symbolOfCards = symbolOfCards;
    }

    public String toString(){
        return "Faces: " + getFaces() + " \tSymbols: " + getSymbolOfCards();
    }
}
