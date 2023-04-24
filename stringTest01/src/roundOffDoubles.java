import java.util.Arrays;

public class roundOffDoubles {

    static long[] round(double... doubles) {
        long[] roundedValues = new long[doubles.length];
        for (int i = 0; i < doubles.length; i++){
            roundedValues[i] = Math.round(doubles[i]);
        }
        return roundedValues;
    }

    public static void main(String[] args) {
        long[] rounded = round(4.7, 3.1, 2.8, 3.3, 5.6);
        System.out.println(Arrays.toString(rounded)); // [5, 3, 3, 3, 6]
    }
}
