import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Margo on 08.10.2014.
 */
public class GenerationRN {
    public static void generate(int p, int a, int y0, int m, int b) throws IOException {
        int tao = 2 * (int) Math.pow(p, m - 1);
        int mod = (int) Math.pow(p, m);


        File fileY = new File("y_sequence.txt");
        File fileX = new File("x_sequence.txt");

        fileY.createNewFile();
        fileX.createNewFile();
        FileOutputStream outputStreamY = new FileOutputStream(fileY);
        FileOutputStream outputStreamX = new FileOutputStream(fileX);


        ArrayList<Integer> y = new ArrayList<Integer>(tao);
        y.add(y0);
        int rightPart;
        for (int i = 0; i < y.size(); i++) {
            rightPart = (a * inverse(y.get(i), mod) + b) % mod;
            y.add(i + 1, rightPart);
            outputStreamY.write(y.get(i));
        }

        ArrayList<Double> x = new ArrayList<Double>(tao);
        for (int i = 0; i < x.size(); i++) {
            x.add((double) y.get(i) / p);
            //outputStreamX.;
        }

        outputStreamY.close();
        outputStreamX.close();
        }

    private static int inverse(int k, int p) {
        int x = 0;
        return x = extndedEuclid(k, p);
    }

    private static int extndedEuclid(int a, int b) {
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



