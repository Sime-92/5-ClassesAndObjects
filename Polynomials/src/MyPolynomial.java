import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename) {
        try {
            Scanner in = new Scanner(new File(filename));
            int degree = in.nextInt();
            coeffs = new double[degree + 1];
            for (int i = 0; i <= degree; i++) {
                coeffs[i] = in.nextDouble();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                    sb.append(" + ");
                }
            }
        }

        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int maxDegree = Math.max(thisDegree, anotherDegree);
        double[] resultCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= thisDegree; i++) {
            resultCoeffs[i] += coeffs[i];
        }

        for (int i = 0; i <= anotherDegree; i++) {
            resultCoeffs[i] += another.coeffs[i];
        }

        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int resultDegree = thisDegree + anotherDegree;
        double[] resultCoeffs = new double[resultDegree + 1];

        for (int i = 0; i <= thisDegree; i++) {
            for (int j = 0; j <= anotherDegree; j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}
