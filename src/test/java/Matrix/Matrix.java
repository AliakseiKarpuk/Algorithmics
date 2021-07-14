package Matrix;

public class Matrix {

    public static void main(String[] args) {

        int i;
        int j;

        System.out.println(MatrixService.readFromFile());
        System.out.println();

        int[][] array = new int[MatrixService.fileStringList()][MatrixService.fileStringList()];

        for(i = 0; i < MatrixService.fileStringList(); i++) {
            for(j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for(i = 0; i < array.length; ++i) {
            for (j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
