public class GenerationRN {

    private final int p;
    private final int a;
    private int y0;
    private final int m;
    private final int b;

    public GenerationRN(int p, int a, int y0, int m, int b) {
        this.p = p;
        this.a = a;
        this.y0 = y0;
        this.m = m;
        this.b = b;
    }

    public int generate() {

        int mod = (int) Math.pow(p, m);
        this.y0 = nextY(mod);
        return (y0);
    }


    private int nextY(int mod) {

        return (a * (inverse(y0, mod)) + b) % mod;
    }

    private int inverse(int k, int p) {

        return this.extndedEuclid(k, p);
    }

    private int extndedEuclid(int a, int b) {
        int q, r, x1, x2, y1, y2;
        int d, x, y;
        x2 = 1;
        x1 = 0;
        y2 = 0;
        y1 = 1;

        while (b > 0) {
            q = a / b;
            r = a - q * b;
            x = x2 - q * x1;
            y = y2 - q * y1;
            a = b;
            b = r;
            x2 = x1;
            x1 = x;
            y2 = y1;
            y1 = y;
        }
        d = a;
        x = x2;
        y = y2;
        if (d == 1)
            return x;
        else return 0;
    }
}



