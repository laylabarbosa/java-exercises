class Scrabble {
    private int Score=0;
    Scrabble(String word) {
        calculateScore(word);
    }
    private void calculateScore(String word){
        for (int i=0; i<word.length(); i++){
            char letter= word.toLowerCase().charAt(i);
            int value = switch (letter) {
                case 'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't' -> 1;
                case 'd', 'g' -> 2;
                case 'b', 'c', 'm', 'p' -> 3;
                case 'f', 'h', 'v', 'w', 'y' -> 4;
                case 'k' -> 5;
                case 'j', 'x' -> 8;
                case 'q', 'z' -> 10;
                default -> 0;
        };
         Score+=value;   
        }
    }
    public int getScore() {
        return Score;
    }
}
