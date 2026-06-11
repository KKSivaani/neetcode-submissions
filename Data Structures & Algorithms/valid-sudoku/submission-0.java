class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                char charNum = board[row][col];
                if (charNum == '.')
                    continue;
                boolean rowAlreadyPresent = !seen.add(charNum + "row" + row);
                boolean colAlreadyPresent = !seen.add(charNum + "col" + col);
                boolean boxAlreadyPresent =
                    !seen.add(charNum + "box" + (row / 3) + "-" + (col / 3));
                if (rowAlreadyPresent || colAlreadyPresent || boxAlreadyPresent)
                    return false;
            }
        }
        return true;
    }
}
