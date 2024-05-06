package Array2DArrayBitManipulation;

public class StaircaseSearchTwoDArray {
    public static boolean caseFirst_staircaseSearch(int [][] matrix,int key){
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length  && col >= 0)
        {
            if (matrix[row][col] == key)
            {
                System.out.println("key found at " + "(" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("key not found!");
       return false;


    }
    public static boolean caseSecond_staircaseSearch(int [][] matrix,int key)
    {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length - 1)
        {
            if (matrix[row][col] == key)
            {
                System.out.println("key found at " + "(" + row + "," + col + ")");
               return true;
            }
            else if (key < matrix[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int [][] matrix = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}};

        int key2 = 20;
        int key1=33;
        caseSecond_staircaseSearch(matrix,key2);
        caseFirst_staircaseSearch(matrix,key1);



    }
}
