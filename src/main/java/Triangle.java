public class Triangle {
    public Triangle() {
    }

    public int getElement(int row, int col) {
        row ++;
        col ++;
        if (col == 1 || row == col) {
            return 1;
        }
        if (col == 2 || col == row - 1) {
            return row - 1;
        }
        double dRow = row;
        int middle = (int)Math.round(dRow/2);
        if(col > middle) {
            if (!(row%2 == 0)) {
                col = middle - (col - middle);
            }
            else {
                col = middle - (col - middle - 1);
            }

        }
        int total = row - 1;
        int additive = row -4;
        int colIndex = 2;
        while (colIndex < col) {
            total +=additive;
            additive -= 2;
            colIndex ++;
        }
        return total;

    }
}
