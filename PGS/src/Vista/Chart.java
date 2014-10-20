package Vista;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RectangleInsets;

public class Chart {
 public Chart() {
    }

    public static ChartPanel getChartPanel(String title, String y_label, 
            HashMap<String, Double> m, String t) {
        XYDataset dataset = createDataset(m, title);
        chart = createChart(dataset, y_label, t);
        ChartPanel chartPanel = new ChartPanel(chart);
        //chartPanel.setMouseZoomable(true, false);
        return chartPanel;
    }

    private static JFreeChart createChart(XYDataset dataset, String y_label, String t) {
       JFreeChart ch = ChartFactory.createTimeSeriesChart(
                t, // title
                "Fechas de seguimientos", // x-axis label
                y_label, // y-axis label
                dataset, // data
                true, // create legend?
                true, // generate tooltips?
                false // generate URLs?
        );
        ch.setBackgroundPaint(Color.WHITE);
        XYPlot plot = (XYPlot) ch.getPlot();
        plot.setBackgroundPaint(Color.getHSBColor(100, 204, 200));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);
  
        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new SimpleDateFormat("dd-MM-yyyy"));
        return ch;
    }

    private static XYDataset createDataset(HashMap<String, Double> m, String title) {// 08/07/14
        TimeSeries s1 = new TimeSeries(title, Day.class);
        m.entrySet().stream().forEach((a) -> {
                    System.out.println("key: "+a.getKey());
            int day = Integer.parseInt(a.getKey().substring(0, 2));
            int month =  Integer.parseInt(a.getKey().substring(3, 5));
            String y= "20"+a.getKey().substring(6);
            int year =  Integer.parseInt(y);
            System.out.println("to add: "+day+"/"+month+"/"+year);
            s1.add(new Day(day, month, year), a.getValue());
        });  
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        dataset.addSeries(s1);
        dataset.setDomainIsPointsInTime(true);
        return dataset;
    }

    public static JFreeChart getJChart() {
        return chart;
    }

    private static JFreeChart chart;
}
