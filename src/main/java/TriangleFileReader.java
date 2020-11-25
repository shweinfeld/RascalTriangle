import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleFileReader {

    private static final int NUM_INTS = 3;
    private int[][] elementList;

    public TriangleFileReader(String filePath) {
        File myObj = new File(filePath);
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
            int numElements = myReader.nextInt();
            elementList = new int[numElements][NUM_INTS];
            for (int i = 0; i < numElements; i++) {
                for (int j = 0; j < NUM_INTS; j++) {
                    elementList[i][j] = myReader.nextInt();
                }
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[][] getElements() {
        return elementList;
    }
}
