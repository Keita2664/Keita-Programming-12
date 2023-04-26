import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashMap<Cipher, CipherId> cipherMap = new HashMap<>();

        cipherMap.put(new Cipher("encrypted phrase.", 1), new CipherId());
        cipherMap.put(new Cipher("decrypted phrase.", 2), new CipherId());
        cipherMap.put(new Cipher("original phrase",3), new CipherId());

        Iterator<Cipher> cipherIterator = cipherMap.keySet().iterator();
        while (cipherIterator.hasNext()){
            Cipher c = cipherIterator.next();
            System.out.println("Cipher: " + c + "\tEncrypted: " + cipherMap.get(c));
        }

/*
        Cipher cipher = new Cipher("encrypted phrase", 1);
        System.out.println(cipher);

 */
    }
}
