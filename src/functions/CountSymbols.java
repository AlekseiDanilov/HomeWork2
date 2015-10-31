package functions;

public class CountSymbols {
    public int countSymbols(String string, char symbol) {
        int count = 0;
        if (string == null) {
            return 0;
        }
        if (string.length() == 0) {
            return 0;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
