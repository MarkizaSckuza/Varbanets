import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Margo on 08.10.2014.
 */
public class Main {
    static int p = 17;
    static int a = 5;
    static int y0 = 6; // y_0 = a + 1
    static int m = 6;
    static int b = a * p;
    public static void main(String[] args) throws IOException {
//        System.out.println(12/10); = 1
//        System.out.println(12%10); = 2
          //ArrayList<Integer> y = GenerationRN.generate(p, a, y0, m, b);
        //System.out.println(GenerationRN.generate(p, a, y0, m, b).toString());
        GenerationRN.generate(p, a, y0, m, b);
    }
}
