public class FirstLetter {
    public static String firstSingleLetter(final String text, final int n) {
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return String.valueOf(text.charAt(i));
            }
        }
        return null; //
    }

    public static void main(String[] args) {
        String text = "KAmran";
        int n = text.length();
        String result = firstSingleLetter(text, n);
        if (result != null) {
            System.out.println("First unique letter: " + result);
        } else {
            System.out.println("No unique letter found.");
        }
    }
}
