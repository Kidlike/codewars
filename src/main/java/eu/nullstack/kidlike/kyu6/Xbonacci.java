package eu.nullstack.kidlike.kyu6;

public class Xbonacci {
    public double[] xbonacci(double[] s, int n) {
        double[] ret = new double[n];

        for (int i = 0; i < n; i++) {
            if (i < s.length) {
                ret[i] = s[i];
            } else {
                ret[i] = 0;
                for (int j = s.length; j > 0; j--) {
                    ret[i] += ret[i - j];
                }
            }
        }

        return ret;
    }
}