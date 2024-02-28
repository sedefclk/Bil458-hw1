
    import java.util.Scanner;
    public class Bil458 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Satır sayısını girin: ");
            int rows = scanner.nextInt();

            System.out.print("Sütun sayısını girin: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

            int value = 1;
            int startRow = 0, endRow = rows - 1, startCol = 0, endCol = columns - 1;

            while (startRow <= endRow && startCol <= endCol) {
                for (int i = startCol; i <= endCol; ++i) {
                    matrix[startRow][i] = value++;
                }
                startRow++;

                for (int i = startRow; i <= endRow; ++i) {
                    matrix[i][endCol] = value++;
                }
                endCol--;

                if (startRow <= endRow) {
                    for (int i = endCol; i >= startCol; --i) {
                        matrix[endRow][i] = value++;
                    }
                    endRow--;
                }

                if (startCol <= endCol) {
                    for (int i = endRow; i >= startRow; --i) {
                        matrix[i][startCol] = value++;
                    }
                    startCol++;
                }
            }

            // Matrisi yazdırma
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            scanner.close();
        }
    }

