import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by DENIS on 06.09.2016.
 */
class Input {
    public static int inputSizeN() throws InvalidParameterException{
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter size N(number of strings)(0 < N < 11)");
            System.out.print("N = ");
            int n = Integer.parseInt(br.readLine());
            if (n < 1 || n > 10) throw new InvalidParameterException("Size N must be 0 < N < 11");
            return n;
        } catch (IOException e) {
            System.out.println("Input/output error!");
        }
        return 0;
    }
    public static int inputSizeM() throws InvalidParameterException{
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter size M(number of columns)(0 < m < 11)");
            System.out.print("M = ");
            int m = Integer.parseInt(br.readLine());
            if (m < 1 || m > 10) throw new InvalidParameterException("Size M must be 0 < M < 11");
            return m;
        } catch (IOException e) {
            System.out.println("Input/output error!");
        } catch (ArithmeticException e) {
            System.out.println("One of the numbers doesn't meet the conditions!");
        }
        return 0;
    }
    public static void inputMatrix(Matrix mtr, int n, int m) {
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
