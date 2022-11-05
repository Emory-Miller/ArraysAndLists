public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public int sum(double[] aa) {
        double sum = 0.0;
        for (int i = 0; i <= aa.length-1; i++){
            sum = sum + aa[i];
        }
        return (int) sum;
    }

    public int average(double[] aa) {
        double sum = 0.0;
        for (int i = 0; i <= aa.length-1; i++) {
            sum = sum + aa[i];
        }
        if ( aa.length == 0){
            return 0;
        }
        return (int) sum/aa.length;
    }

}
