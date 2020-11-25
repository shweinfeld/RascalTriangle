import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleFileReader {
    private int elementList[][];

    public int[][] getElements() {
        return elementList;
    }


    public TriangleFileReader(String filePath) {
        File myObj = new File(filePath);
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
            int numElements = myReader.nextInt();
            elementList = new int[numElements][3];
            for(int i = 0; i < numElements; i++) {
                for (int j = 0; j < 3; j++) {
                    elementList[i][j] = myReader.nextInt();
                }
            }

            myReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
