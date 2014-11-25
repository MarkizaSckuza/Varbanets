import javafx.geometry.Point2D;
import javafx.scene.chart.Chart;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Margo on 25.11.2014.
 */
public class MyChart extends JPanel{
    protected  void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(Color.RED);
        for (int i = 0; i <Main.xData.length; i++) {
            graphics2D.drawLine((int) Main.xData[i], Main.yData[i], (int) Main.xData[i], Main.yData[i]);
        }
    }
//    public static void draw(double[] xData, int[] yData) {
//        for (int i = 0; i < xData.length; i++) {
//            Point2D point2D = new Point2D(xData[i], yData[i]);
//
//        }
//        Chart }
}
