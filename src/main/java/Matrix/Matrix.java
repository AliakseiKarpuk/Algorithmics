package Matrix;

public class Matrix {

    private Integer array[][];

    public Matrix(Integer[][] array, int lengthColumn, int lengthRow) {
        this.array = new Integer[lengthColumn][lengthRow];
        for (int i = 0; i < lengthColumn; i++) {
            for (int j = 0; j < lengthColumn; j++) {
                this.array[i][j] = array[i][j];
            }
        }
        System.out.println(("\n" + printMatrix()));

        fillingTheMainDiagonal();

        System.out.println(("\n" + printMatrix()));
    }

    private void fillingTheMainDiagonal() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                if (this.array[i][j].equals(0)) {
                    if (i != j) {
                        Integer buffer = this.array[i][i];
                        this.array[i][i] = this.array[i][j];
                        this.array[i][j] = buffer;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return printMatrix();
    }

    private String printMatrix() {
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                string.append(this.array[i][j]).append(" ");
            }
            string.append("\n");
        }
        return string.toString();
    }
}
