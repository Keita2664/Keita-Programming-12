public class FaceCards extends Cards{
    private String faces;
    private Symbols symbols;
    private int numbers;

    public FaceCards(String faces, Symbols symbols, int numbers){
        this.faces = faces;
        this.symbols = symbols;
        this.numbers = numbers;
    }

    public FaceCards(){
        faces = "none";
        symbols = Symbols.NONE;
        numbers = 0;
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

    public void setSymbolOfCards(Symbols symbols) {
        this.symbols = symbols;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public String toString(){
        return "Faces: " + getFaces() + " \tSymbols: " + getSymbols();
    }
}
