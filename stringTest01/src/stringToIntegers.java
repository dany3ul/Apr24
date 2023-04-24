public class stringToIntegers {

    static int sumIntegersAsString(String...stringIntegers) {
        int[] integerArrayFromString = new int[stringIntegers.length];
        for (int i = 0; i < stringIntegers.length; i++){
            integerArrayFromString[i] = Integer.parseInt(stringIntegers[i]);
        }

        int total = 0;
        for (int addend : integerArrayFromString) { // the vararg becomes an array
            total += addend;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumIntegersAsString("10", "20")); // 30
        System.out.println(sumIntegersAsString("10", "20", "30")); // 60
        System.out.println(sumIntegersAsString("10", "20", "30", "40")); // 100
    }
}
