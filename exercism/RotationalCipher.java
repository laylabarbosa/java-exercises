import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class RotationalCipher {
    private int shiftKey;
    static Map<Integer, Character> alphabet = new HashMap<Integer,Character>();
    RotationalCipher(int shiftKey) {
        this.shiftKey=shiftKey;
        alphabet.put(1, 'a');
        alphabet.put(2, 'b');
        alphabet.put(3, 'c');
        alphabet.put(4, 'd');
        alphabet.put(5, 'e');
        alphabet.put(6, 'f');
        alphabet.put(7, 'g');
        alphabet.put(8, 'h');
        alphabet.put(9, 'i');
        alphabet.put(10, 'j');
        alphabet.put(11, 'k');
        alphabet.put(12, 'l');
        alphabet.put(13, 'm');
        alphabet.put(14, 'n');
        alphabet.put(15, 'o');
        alphabet.put(16, 'p');
        alphabet.put(17, 'q');
        alphabet.put(18, 'r');
        alphabet.put(19, 's');
        alphabet.put(20, 't');
        alphabet.put(21, 'u');
        alphabet.put(22, 'v');
        alphabet.put(23, 'w');
        alphabet.put(24, 'x');
        alphabet.put(25, 'y');
        alphabet.put(26, 'z');
    }
    String rotate(String data) {
        int key=0;
        StringBuilder cipheredData = new StringBuilder();
        for (int i =0; i< data.length();i++){
            if(!Character.isAlphabetic(data.charAt(i))){
                cipheredData.append(data.charAt(i));
            }
            else{
                if(!Character.isUpperCase(data.charAt(i))){    
                    for (Entry<Integer, Character> entry : alphabet.entrySet()) {
                        if (entry.getValue().equals(data.charAt(i))) {
                            key = entry.getKey()+this.shiftKey;
                                if (key>26)key-=26;
                        }
                    }
                    cipheredData.append(alphabet.get(key));
                }
                else{
                    for (Entry<Integer, Character> entry : alphabet.entrySet()) {
                        if (entry.getValue().equals(Character.toLowerCase(data.charAt(i)))) {
                            key = entry.getKey()+this.shiftKey;
                                if (key>26)key-=26;
                        }    
                    }
                    cipheredData.append(Character.toUpperCase(alphabet.get(key)));
                }
            }
        } 
        return cipheredData.toString();
    }
}
