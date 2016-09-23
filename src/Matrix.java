import java.util.Random;

class Matrix {
    private int[][] mtr;
    private int n;
    private int m;

    Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        mtr = new int[n][m];
    }

    public void setMatrixRandomNumbers() {
        final int MAX = 99;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mtr[i][j] = random.nextInt(MAX + 1);
            }
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(mtr[i][j] + " ");
            System.out.println();
        }
    }

    public int[][] getMatrixPtr() {
        return mtr;
    }

    public int getSizeN() {
        return n;
    }

    public int getSizeM() {
        return m;
    }

    public boolean checkSymmetric() {
        boolean symmetric = true;
        try {
            Input.checkSquare(n, m);
            for (int i = 0; i < n && symmetric; i++) {
                for (int j = i + 1; j < n && symmetric; j++)
                    if (mtr[i][j] != mtr[j][i]) {
                        symmetric = false;
                    }
            }
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        }
        return symmetric == true;
    }

    public void swapMaximumAndCentralElements() throws InvalidParameterException {
        if (n % 2 == 0) {
            throw new InvalidParameterException("Size of matrix must be an odd number to swap the central and the maximum elements");
        }
        int tmp, indexIOfMax = 0, indexJOfMax = 0, max = mtr[0][0];
        for (int i = 0; i < n; i++) {
            if (max >= mtr[i][i]) {
                if (max >= mtr[i][n - i - 1]) {
                } else {
                    max = mtr[i][n - i - 1];
                    indexIOfMax = i;
                    indexJOfMax = n - i - 1;
                }
            } else if (mtr[i][i] >= mtr[i][n - i - 1]) {
                max = mtr[i][i];
                indexIOfMax = i;
                indexJOfMax = i;
            } else {
                max = mtr[i][n - i - 1];
                indexIOfMax = i;
                indexJOfMax = n - i - 1;
            }
        }
        int centrePosition = n / 2;
        if (max != mtr[centrePosition][centrePosition]) {
            tmp = mtr[centrePosition][centrePosition];
            mtr[centrePosition][centrePosition] = mtr[indexIOfMax][indexJOfMax];
            mtr[indexIOfMax][indexJOfMax] = tmp;
        }
    }
}
