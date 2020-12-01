package eu.nullstack.kidlike.kyu6;

public class Tribonacci {

    /**
     * example
     *
     * input: {1, 1, 1}, 10
     * output: {1, 1, 1, 3, 5, 9, 17, 31, 57, 105}
     */
    public double[] tribonacci(double[] s, int n) {
        double[] ret = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < 3) {
                ret[i] = s[i];
            } else {
                ret[i] = ret[i - 1] + ret[i - 2] + ret[i - 3];
            }
        }

        return ret;
    }
}
