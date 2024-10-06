import static java.lang.Math.*;
import static java.lang.Math.exp;

public class Main {
    public static void main(String[] args) {

        long[] z = new long[6];
        for (int i = 0; i < z.length; i++) {
            z[i] = 5 + i * 2;
        }

        float[] x = new float[13];
        for (int i = 0; i < 13; i++) {
            x[i] = (float) random() * 14f - 12f;
        }

        double[][] w = new double[6][13];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 13; j++) {
                if (z[i] == 5) {
                    w[i][j] = first_form(x[j]);
                } else if (z[i] == 9 || z[i] == 13 || z[i] == 15) {
                    w[i][j] = second_form(x[j]);
                } else {
                    w[i][j] = third_form(x[j]);
                }
            }
        }
        print_matrix(w);

    }
    public static double first_form(float x){
        return pow((2.0/3.0) / asin(exp(-abs(x))), 3.0);
    }
    public static double second_form(float x){
        return pow((PI / (x / (x - 1.0/4.0) - 3.0))/(PI + atan(cos(x))), 2.0);
    }
    public static double third_form(float x){
        return pow((exp(sin(x)) - (2.0/3.0))/(PI), 2.0);
    }
    public static void print_matrix(double[][] w){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 13; j++) {
                if (j == 12) {
                    System.out.printf("%.5f%n", w[i][j]);
                } else {
                    System.out.print(String.format("%.5f", w[i][j]) + ", ");
                }
            }

        }
    }
}