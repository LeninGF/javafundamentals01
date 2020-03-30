package cec.epn.negocio;

/**
 * Second Degree Class
 * This class solves the traditional equation ax^2+bx+c=0
 *
 * @author Lenin
 * @version 1.0.1
 */
public class SecondDegreeEquation {
    private double a;
    private double b;
    private double c;

    public SecondDegreeEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solveSecondDegEq() {
        double[] roots = new double[2];
        double x1, x2;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant >= 0) {
            // calculate roots
            x1 = -b / (2 * a) + Math.sqrt(discriminant) / (2 * a);
            x2 = -b / (2 * a) - Math.sqrt(discriminant) / (2 * a);
        } else {
            // set error value
            x1 = -999;
            x2 = -999;
        }
        roots[0] = x1;
        roots[1] = x2;

        return roots;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
