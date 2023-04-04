public class NumberCards extends Cards{
    private int numberOfCards;
    private Symbols symbolOfCards;

    public NumberCards(int numberOfCards, Symbols symbolOfCards){
        this.numberOfCards = numberOfCards;
        this.symbolOfCards = symbolOfCards;
    }

    public NumberCards(){
        numberOfCards = 0;
        symbolOfCards = Symbols.NONE;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public Symbols getSymbolOfCards() {
        return symbolOfCards;
    }

    public void setSymbolOfCards(Symbols symbolOfCards) {
        this.symbolOfCards = symbolOfCards;
    }

    public String toString(){
        return "Number: " + getNumberOfCards() + "\tSymbol: " + getSymbolOfCards();
    }
}
