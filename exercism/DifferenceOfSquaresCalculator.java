class DifferenceOfSquaresCalculator {
    int squareOfSum, sumOfSquare;
    int computeSquareOfSumTo(int input) {
    int i=1;
      while(i<=input){
          squareOfSum+=i;
          i++;
      }   
        return squareOfSum * squareOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        int s=1;  
      while(s<=input){
          sumOfSquare+=s*s;
          s++;
      }   
        return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        }
}
