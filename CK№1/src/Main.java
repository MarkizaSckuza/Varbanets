import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Margo on 08.10.2014.
 */
public class Main {
    static int P = 17;
    static int A = 5;
    static int Y0 = 6; // y_0 = a + 1
    static int M = 6;
    static int B = A * P;
    public static double[] xData = new double[100];
    public static int [] yData = new int[100];
    public static void main(String[] args) throws IOException {
//        System.out.println(12/10); = 1
//        System.out.println(12%10); = 2
        int tao = 2 * (int) Math.pow(P, M - 1);
        GenerationRN generationRN = new GenerationRN(P, A, Y0, M, B);
        File fileX = new File("x_sequence.txt");
        fileX.createNewFile();
        FileWriter fileWriter = new FileWriter(fileX);
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            yData[i] = generationRN.generate();
            xData[i] = xData[i] / P;
//            MyChart.draw(xData, yData);
//            s.append(generationRN.generate()).append(" ");
//            fileWriter.write(s.toString());
        }
        MyChart myChart = new MyChart();
        myChart.paintComponent();
    }
}
