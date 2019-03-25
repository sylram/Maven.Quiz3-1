package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String [][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }


    public String[] getRow(Integer value) {
        String [] row = new String[3];
        int index = 0;
            for (int j = 0; j < board.length ; j++) {
                row[index]= board[value][j];
                index++;
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String [] row = new String[3];
        int index = 0;
        for (int j = 0; j < board.length ; j++) {
            row[index]= board[j][value];
            index++;
        }
        return row;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String []row = getRow(rowIndex);
        if (row[0] == row[1]&&row[0] == row[2]) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String []column = getColumn(columnIndex);
        if (column[0] == column[1] && column[0] == column[2]) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        String result = "";
        for (int i = 0; i < board.length; i++) {
            if (isColumnHomogeneous(i)) {
                result = board[i][i];

            }
            if (isRowHomogenous(i)) {
                result = board[i][i];

            }
            if (board[0][0] == board[1][1] && board[2][2] == board[0][0]) {
                System.out.println(i);
                result = board[1][1];

            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                System.out.println(i);
                result = board[1][1];

            }

        }return result;
    }

    public String[][] getBoard() {
        return board;
    }
}
