public class Day29 {
    public static void main(String[] args) {
        System.out.println(ans("AAAABBBCCDAA"));
    }
    private static String ans(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (s.charAt(j) != s.charAt(j - 1)) {
                sb.append(j - i).append(s.charAt(j - 1));
                i = j;
            }
        }

        sb.append(n - i).append(s.charAt(n - 1));

        return sb.toString();
    }
}
