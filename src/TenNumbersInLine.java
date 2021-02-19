public class TenNumbersInLine {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        int i = start;
        int positionInLine = 0;

        while (i <= end) {
            System.out.print(i + " ");
            positionInLine++;

            if (positionInLine % 10 == 0) {
                System.out.println();
            }

            i++;
        }
    }
}
