class Matrix {
    private int[][] matrixNumbers; 
        Matrix(String matrixAsString) {
            String[] matrix = matrixAsString.split("\n");
            System.out.println(matrix[0].replaceAll(" ", ""));
            String[][] matrixbi= new String [matrix.length][matrix[0].replaceAll(" ", "").length()];
            matrixNumbers = new int[matrixbi.length][matrixbi[0].length];
            for (int i=0; i<matrix.length; i++){
                matrixbi[i] = matrix[i].split(" ");
            }
            for (int i=0; i<matrixbi.length; i++){
                for (int j=0; j<matrixbi[0].length; j++){  
                    matrixNumbers[i][j] = Integer.parseInt(matrixbi[i][j]);
                }
            }
        }
    
        int[] getRow(int rowNumber) {
            int[] row = new int[matrixNumbers[0].length];
            for (int j=0; j<matrixNumbers[0].length; j++){
                    row[j]=matrixNumbers[rowNumber-1][j];
            }
            return row;
        }
    
        int[] getColumn(int columnNumber) {
            int[] column = new int[matrixNumbers.length];
            for (int j=0; j<matrixNumbers.length; j++){
                    column[j]=matrixNumbers[j][columnNumber-1];
            }
            return column;
        }
    }
    