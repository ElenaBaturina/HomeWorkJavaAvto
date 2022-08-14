package homeWork4;

public class homeWork4 {

    public static double areaTriangle(double sideA, double sideB, double sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new Exception("<0");
        }

        double p = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        //   System.out.println("Площадь треугольника = " + s);
        return s;

    }

    public static void main(String[] args) throws Exception {
        areaTriangle(10, 10, 10);
    }
}
