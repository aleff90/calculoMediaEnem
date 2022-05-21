package entities;

public class CalculoMedia {

    public double cn;
    public double ch;
    public double lc;
    public double m;

    public double mediaTotal() {
        return ((cn + ch + lc + m) / 4);
    }

}
