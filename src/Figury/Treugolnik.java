package Figury;

    public class Treugolnik implements Connect {
        double p;
        double s;
        int a;
        int b;
        int c;

        @Override
         public void s() {
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Площадь треугольника " + s);
            }

        @Override
        public void p() {
            p = a + b + c;
            System.out.println("Периметр треугольника = " + p);
        }
}
