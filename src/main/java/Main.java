import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        String filePath = args[0];
        TriangleFileReader fileReader = new TriangleFileReader(filePath);
        int[][] elementList = fileReader.getElements();
        for (int[] element:elementList) {
            int elementNum = element[0];
            int elementRow = element[1];
            int elementCol = element[2];
            System.out.println(elementNum + " " + triangle.getElement(elementRow, elementCol));
        }

    }
}
