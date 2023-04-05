public class FaceCards extends Cards{
    private String faceOfCards;
    private Symbols symbolOfCards;
    private int numbers;

    public FaceCards(String faceOfCards, Symbols symbolOfCards, int numbers){
        this.faceOfCards = faceOfCards;
        this.symbolOfCards = symbolOfCards;
        this.numbers = numbers;
    }

    public FaceCards(){
        faceOfCards = "none";
        symbolOfCards = Symbols.NONE;
        numbers = 0;
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

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String toString(){
        return "Faces: " + getFaces() + " \tSymbols: " + getSymbolOfCards();
    }
}
