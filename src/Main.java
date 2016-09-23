import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Enter sizes of square matrix\n(number of string equals number of columns(matrix must be square): N = M)");
            int numOfStrings = Input.inputSizeN();
            int numOfColumns = Input.inputSizeM();
            Input.checkSquare(numOfStrings, numOfColumns);
            Matrix mtr = new Matrix(numOfStrings, numOfColumns);
            System.out.println("Enter matrix:");
            Input.inputMatrix(mtr, mtr.getSizeN(), mtr.getSizeM());
            if (mtr.checkSymmetric())
                System.out.println("Your matrix is symmetric");
            else
                System.out.println("Your matrix is not symmetric");
            mtr.output();
            mtr.swapMaximumAndCentralElements();
            System.out.println("Matrix after swap:");
            mtr.output();
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input/output error!");
        }
    }
}
