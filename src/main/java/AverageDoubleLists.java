import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return (double) aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        double sum = 0;
        for (int i = 0; i <= aa.size() - 1; i++) {
            sum = sum + aa.get(i);
        }
        return sum;
    }
    public Double average(ArrayList<Double> aa) {
        double sum = 0;
        for (int i = 0; i <= aa.size() - 1; i++) {
            sum = sum + aa.get(i);
        }
        if (aa.size() == 0){
            return 0.0;
        }
        return sum/aa.size();
    }

}
