import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class Controller {

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    public void initialize() {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Jumlah Korban (Jiwa)");


        series.getData().add(new XYChart.Data<>("Aceh", 1500));
        series.getData().add(new XYChart.Data<>("Sumut", 3200));
        series.getData().add(new XYChart.Data<>("Sumbar", 2100));
        series.getData().add(new XYChart.Data<>("Riau", 1800));
        series.getData().add(new XYChart.Data<>("Jambi", 900));
        series.getData().add(new XYChart.Data<>("Sumsel", 2500));
        series.getData().add(new XYChart.Data<>("Lampung", 1200));
        series.getData().add(new XYChart.Data<>("Bengkulu", 600));

        barChart.getData().addAll(series);
    }
}