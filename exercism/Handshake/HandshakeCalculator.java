package Handshake;
import java.util.List;
import java.util.*;

class HandshakeCalculator {
    List<Signal> handshake = new ArrayList<>();
    List<Signal> calculateHandshake(int number) {
        String binary = intToBinary(number);
        
        if (binary.charAt(binary.length()-1) == '1')handshake.add(Signal.WINK); 
        if (binary.length() >= 2 && binary.charAt(binary.length()-2) == '1')                  handshake.add(Signal.DOUBLE_BLINK);
        if (binary.length() >= 3 && binary.charAt(binary.length()-3) == '1') handshake.add(Signal.CLOSE_YOUR_EYES);
        if (binary.length() >= 4 && binary.charAt(binary.length()-4) == '1') handshake.add(Signal.JUMP);
        if (binary.length() >= 5 && binary.charAt(binary.length()-5) == '1') Collections.reverse(handshake);
        return handshake;
    }
    private String intToBinary(int number){
        return Integer.toBinaryString(number);
    }
}
