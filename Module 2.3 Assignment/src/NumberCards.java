public class NumberCards extends Cards{
    private int numbers;
    private Symbols symbols;

    public NumberCards(int numbers, Symbols symbols){
        this.numbers = numbers;
        this.symbols = symbols;
    }

    public NumberCards(){
        numbers = 0;
        symbols = Symbols.NONE;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numberOfCards) {
        this.numbers = numberOfCards;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public String toString(){
        return "Number: " + getNumbers() + "\tSymbol: " + getSymbols();
    }
}
