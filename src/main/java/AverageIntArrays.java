public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int sum = 0;
        for (int i = 0; i <= aa.length-1; i++){
            sum = sum + aa[i];
        }
        return sum;
    }

    public int average(int[] aa) {
        int sum = 0;
        for (int i = 0; i <= aa.length-1; i++) {
            sum = sum + aa[i];
        }
        if ( aa.length == 0){
            return 0;
        }
        return sum/aa.length;
    }

}
