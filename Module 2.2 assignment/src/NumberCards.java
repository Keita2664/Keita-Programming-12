public class NumberCards extends Cards{
    private int numbers;
    private Symbols symbolOfCards;

    public NumberCards(int numbers, Symbols symbolOfCards){
        this.numbers = numbers;
        this.symbolOfCards = symbolOfCards;
    }

    public NumberCards(){
        numbers = 0;
        symbolOfCards = Symbols.NONE;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numberOfCards) {
        this.numbers = numberOfCards;
    }

    public Symbols getSymbolOfCards() {
        return symbolOfCards;
    }

    public void setSymbolOfCards(Symbols symbolOfCards) {
        this.symbolOfCards = symbolOfCards;
    }

    public String toString(){
        return "Number: " + getNumbers() + "\tSymbol: " + getSymbolOfCards();
    }
}
