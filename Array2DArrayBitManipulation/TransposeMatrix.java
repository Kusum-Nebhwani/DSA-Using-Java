package Array2DArrayBitManipulation;

public class TransposeMatrix {
    public static void printTranspose (int [][] arr) {
        int[][] transpose = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                transpose[j][i] = arr[i][j];
            }
        }
        for(int i = 0;i<transpose.length;i++){
            for(int j = 0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int [][] arr ={{1,3,5},{2,4,6}};
        printTranspose(arr);
    }
}
