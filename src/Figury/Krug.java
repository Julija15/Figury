package Figury;

public class Krug implements Connect{
    double s;
    double p;
    double pi;
    int r;

    @Override
    public void s() {
        s = pi * r * r;
        System.out.println(" ������� ����� = " + s);
        }

    @Override
    public void p() {
        p = 2 * pi * pi * r;
        System.out.println( " �������� ����� = " + p);
        }
    }
