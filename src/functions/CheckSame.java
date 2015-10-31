package functions;

public class CheckSame {
    public boolean checkSame(String[] strings) {
        if (strings == null) {
            return false;
        }
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i] != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[j] != null) {
                        if (strings[i].equals(strings[j])) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
