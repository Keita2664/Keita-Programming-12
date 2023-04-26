/*
import java.util.Objects;


public class EncryptOrDecrypt {
    Cipher cipher = new Cipher();

    String encrypted;
    String decrypted;
    String phrase = cipher.phrase;
    int shift = cipher.shift;

    EncryptOrDecrypt(){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String generator = "";
        for (int i = 0; i < phrase.length(); i++){
            if (Character.getNumericValue(phrase.charAt(i)) <= 35 - shift && Character.getNumericValue(phrase.charAt(i)) != -1){
                generator += alphabets.charAt(Character.getNumericValue(phrase.charAt(i)) + shift - 10);
            }
            else if (Character.getNumericValue(phrase.charAt(i)) > 35 - shift && Character.getNumericValue(phrase.charAt(i)) != -1){
                generator += alphabets.charAt(Character.getNumericValue(phrase.charAt(i)) - 10 - alphabets.length() + shift);
            }
            else {
                generator += phrase.charAt(i);
            }
            encrypted = generator;
        }
    }

    public int hashCode(){
        return encrypted.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof EncryptOrDecrypt){
            EncryptOrDecrypt other = (EncryptOrDecrypt) o;
            if (this.encrypted.equals(other.encrypted)) {
                return true;
            }
        }
        return false;
    }
    //public String toString(){
    //    return encrypted;
    //}
}

 */
