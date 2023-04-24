public class toCSV {

    static String toCsv(String...strings) {
        // add your code here
        StringBuilder builder = new StringBuilder();
        int numberOfValues = strings.length;
        for (int i = 0; i < numberOfValues; i++){
            builder.append(strings[i]);
            builder.append(",");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCsv("Row", "row", "row", "your boat"));
        // Row,row,row,your boat,
    }
}
