import java.util.Objects;

public class Cipher {
     String phrase;
     int shift;
     String encrypted;
     String decrypted;
     //the numerical value of "z" in getNumericalValue method.
     int numericalValueOfZ = 35;
     //the difference between the numerical value of "a" in "getNumericalValue" method and "String alphabets".
     int differenceOfNumericalValueOfA = 10;


    public Cipher(String phrase, int shift){
        this.phrase = phrase;
        this.shift = shift;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getEncrypted() {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String generator = "";

        for (int i = 0; i < phrase.length(); i++) {
            if (Character.getNumericValue(phrase.charAt(i)) <= numericalValueOfZ - shift && Character.getNumericValue(phrase.charAt(i)) != -1) {
                generator += alphabets.charAt(Character.getNumericValue(phrase.charAt(i)) + shift - differenceOfNumericalValueOfA);
            } else if (Character.getNumericValue(phrase.charAt(i)) > numericalValueOfZ - shift && Character.getNumericValue(phrase.charAt(i)) != -1) {
                generator += alphabets.charAt(Character.getNumericValue(phrase.charAt(i)) - differenceOfNumericalValueOfA - alphabets.length() + shift);
            } else {
                generator += phrase.charAt(i);
            }
            encrypted = generator;
        }
        return encrypted;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

    public String getDecrypted() {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String generator = "";
        for (int i = 0; i < phrase.length(); i++){
            if (Character.getNumericValue(phrase.charAt(i)) >= 10 + shift && Character.getNumericValue(phrase.charAt(i)) != -1){
                generator += alphabets.charAt(Character.getNumericValue(phrase.charAt(i)) - shift - 10);
            }
            else if (Character.getNumericValue(phrase.charAt(i)) < 10 + shift && Character.getNumericValue(phrase.charAt(i)) != -1){
                generator += alphabets.charAt(Character.getNumericValue(phrase.charAt(i)) - 10 + alphabets.length() - shift);
            }
            else {
                generator += phrase.charAt(i);
            }
            decrypted = generator;
        }
        return decrypted;
    }

    public void setDecrypted(String decrypted) {
        this.decrypted = decrypted;
    }

    Cipher(){
        encrypted = getEncrypted();
        decrypted = getDecrypted();
    }

    public int hashCode(){
        return phrase.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cipher){
            Cipher other = (Cipher) o;
            if (this.phrase.equals(other.phrase)){
                return true;
            }
        }
        return false;
    }



    public String toString(){
    return "phrase: " + phrase + "\tShift: " + shift +"\tEncrypted: " + getEncrypted() + "\tDecrypted: " + getDecrypted();
    }
}
