public class homeWork4 {

    public static double areaTriangle(int sideA, int sideB, int sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw  new Exception("<0");
        }

        double p = (sideA+sideB+sideC)/2;
        return  Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

    }

    public static void main(String[] args) throws Exception {
        areaTriangle(10, 10, 10);
    }
  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сторона a=");
        int a =  sc.nextInt();

        System.out.println("Сторона b=");
        int b = sc.nextInt();

        System.out.println("Сторона c=");
        int c = sc.nextInt();

        int p = (a+b+c)/2;
        int e = p*(p-a)*(p-b)*(p-c);
        double s = Math.sqrt(e);

        System.out.println("Площадь треугольника = " + s);

        sc.close();


    }*/
 /* public static double calculateArea(double sideA, double sideB, double sideC) throws Exception {
      if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
          throw new Exception("<0");
      }

      double halfPerimeter = (sideA + sideB + sideC) / 2;
      return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
  }*/
}
