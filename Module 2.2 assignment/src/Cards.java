public class Cards {
    private int numbers;
    private String faces;
    private Symbols symbols;

    public Cards(int numbers,String faces, Symbols symbols){
        this.numbers = numbers;
        this.faces = faces;
        this.symbols = symbols;
    }

    public Cards(){
        numbers = 0;
        faces = "none";
        symbols = Symbols.NONE;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String getFaces() {
        return faces;
    }

    public void setFaces(String faces) {
        this.faces = faces;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public String toString(){
        return "Number: " + getNumbers() + "\tFace: " + getFaces() + "\tSymbol: " + getSymbols();
    }
}