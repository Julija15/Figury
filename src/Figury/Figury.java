package Figury;

public abstract class Figury {
    protected String name = "";
    protected double pi = 3.1415;
    double r;
    int a;
    int b;
    int c;
    double s;
    double p;
    Figury[] figuries = new Figury[10];

    public Figury(double s, double p) {
        this.s = s;
        this.p = p;
    }

    public abstract void Figuries();

    public abstract void Name();

    public abstract double S();

    public abstract double P();

    public double Treugolnik() {
        this.name = "treugolnik";
        this.a = a;
        this.b = b;
        this.c = c;
        return 0;
    }
    public void Krug() {
        name = "krug";
        this.r = r;
        this.pi = pi;
    }
    public void Pryamougolnik() {
        name = "pryamougolnik";
        this.a = a;
        this.b = b;
    }
}




