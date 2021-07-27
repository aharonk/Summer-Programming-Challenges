class Solution {
    char[][] BOARD;

    public char getInRow(int i, int j) {
        return BOARD[i][j];
    }

    public char getInCol(int i, int j) {
        return BOARD[j][i];
    }

    public char getInBox(int i, int j) {
        return BOARD[(i/3)*3 + j/3][(i%3)*3 + j%3];
    }

    public boolean isValidSudoku(char[][] board) {
        BOARD = board;
        HashSet<Character> currentRow = new HashSet<>(), currentCol = new HashSet<>(), currentBox = new HashSet<>();
        char currPos;

        for (int i = 0; i < 9; i++) {
            currentRow.clear();
            currentCol.clear();
            currentBox.clear();

            for (int j = 0; j < 9; j++) {
                if ((currPos = getInRow(i, j)) != '.') {
                    if(currentRow.contains(currPos)) {
                        return false;
                    }
                    currentRow.add(currPos);
                }

                if ((currPos = getInCol(i, j)) != '.') {
                    if(currentCol.contains(currPos)) {
                        return false;
                    }
                    currentCol.add(currPos);
                }

                if ((currPos = getInBox(i, j)) != '.') {
                    if(currentBox.contains(currPos)) {
                        return false;
                    }
                    currentBox.add(currPos);
                }
            }
        }
        return true;
    }
}
