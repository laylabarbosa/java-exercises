package ReverseString;
class ReverseString {

    String reverse(String inputString) {
        StringBuilder reversedString= new StringBuilder();
        int j = inputString.length()-1;
        for (int i =0; i<inputString.length(); i++){
            reversedString.append(inputString.charAt(j));
            j--;
        }
        return reversedString.toString();
        }
}
