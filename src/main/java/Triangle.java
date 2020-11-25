public class Triangle {
    public Triangle() { }

    public int getElement(int row, int col) {

        int middleCol = (int)Math.round((double) row /2);

        if(col > middleCol) {
            //get smallest column equivalent
            col = getColEquivalent(row, col, middleCol);
        }

        return findElement(row, col);
    }

    private int getColEquivalent(int row, int col, int middleCol) {
        if (row %2 == 0) {
            col = middleCol - (col - middleCol);
        }
        else {
            col = middleCol - (col - middleCol + 1);
        }
        return col;
    }

    private int findElement(int row, int col) {
        if (col == 0) {
            return 1;
        }
        if (col == 1) {
            return row;
        }

        int total = row;
        int additive = row -3;
        int colIndex = 1;
        while (colIndex < col) {
            total +=additive;
            additive -= 2;
            colIndex ++;
        }
        return total;
    }
}
