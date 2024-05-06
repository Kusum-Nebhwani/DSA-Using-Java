package Array2DArrayBitManipulation;
import java.util.*;

public class TwoDArray {


    public static int  largest_Element(int [][] matrix){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j< matrix[0].length;j++){
             if(matrix[i][j] > largest) {
                 largest = matrix[i][j];
             }


            }

        }
        System.out.println("largest number: " + largest);
        return largest;
    }
    public static int  smallest_Element(int [][] matrix){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j< matrix[0].length;j++){
                if(matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }


            }

        }
        System.out.println("smallest number: " + smallest);
        return smallest;
    }

    public static boolean search (int [][] matrix,int key){
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j< matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at cell (" + i + "," + j + ")");
                    return true;
                }

            }

        }
        System.out.println("key not found");
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        // rows' length ---> matrix.length
        // columns' length --> matrix[0].length

        //input
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) { //outer loop for traversing row wise
            for (int j = 0; j < matrix[0].length; j++) { //inner loop for traversing column wise

                matrix[i][j] = sc.nextInt();

            }

        }


        //output

        for (int i = 0; i < matrix.length; i++) { //outer loop for traversing row wise
            for (int j = 0; j < matrix[0].length; j++) { //inner loop for traversing column wise

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

        search(matrix,8);

        largest_Element(matrix);
        smallest_Element(matrix);



    }
}