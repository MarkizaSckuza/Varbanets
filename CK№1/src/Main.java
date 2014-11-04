import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Margo on 08.10.2014.
 */
public class Main {
    static int P = 17;
    static int A = 5;
    static int Y0 = 6; // y_0 = a + 1
    static int M = 6;
    static int B = A * P;
    public static void main(String[] args) throws IOException {
//        System.out.println(12/10); = 1
//        System.out.println(12%10); = 2
          //ArrayList<Integer> y = GenerationRN.generate(p, a, y0, m, b);
        //System.out.println(GenerationRN.generate(p, a, y0, m, b).toString());
        GenerationRN.generate(P, A, Y0, M, B);
    }
}
