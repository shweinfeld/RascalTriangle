import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int NUM_ELEMENT = 0;
    private static final int ELEMENT_ROW = 1;
    private static final int ELEMENT_COL = 2;

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        String filePath = args[0];
        TriangleFileReader fileReader = new TriangleFileReader(filePath);
        int[][] elementList = fileReader.getElements();
        for (int[] element:elementList) {
            int elementNum = element[NUM_ELEMENT];
            int elementRow = element[ELEMENT_ROW];
            int elementCol = element[ELEMENT_COL];
            System.out.println(elementNum + " " + triangle.getElement(elementRow, elementCol));
        }
    }
}
