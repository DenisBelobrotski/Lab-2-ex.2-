import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    public static int inputSizeN() throws InvalidParameterException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size N(number of strings)(0 < N < 11)");
        System.out.print("N = ");
        int n = sc.nextInt();
        if (n < 1 || n > 10) {
            throw new InvalidParameterException("Size N must be 0 < N < 11");
        }
        return n;
    }

    public static int inputSizeM() throws InvalidParameterException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size M(number of columns)(0 < m < 11)");
        System.out.print("M = ");
        int m = sc.nextInt();
        if (m < 1 || m > 10) {
            throw new InvalidParameterException("Size M must be 0 < M < 11");
        }
        return m;
    }

    public static void inputMatrix(Matrix mtr, int n, int m) throws InputMismatchException {
        int[][] tempMtr = mtr.getMatrixPtr();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                System.out.print("mtr[" + i + "][" + j + "] = ");
                tempMtr[i][j] = sc.nextInt();
            }
    }

    public static boolean checkSquare(int numOfStrings, int numOfColumns) throws InvalidParameterException {
        if (numOfStrings != numOfColumns) {
            throw new InvalidParameterException("Matrix is not spuare");
        }
        return (numOfStrings == numOfColumns);
    }
}
