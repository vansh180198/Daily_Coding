public class Day25 {
    public static void main(String[] args) {
        System.out.println(ans("ra.", "ray"));

    }

    private static boolean sol(char[] s1, int i, char[] s2, int j, Boolean[][] matrix) {
        if (i >= s1.length)
            return j >= s2.length;

        if (matrix[i][j] != null)
            return matrix[i][j];

        boolean ast = i + 1 < s1.length && s1[i + 1] == '*';

        if (j >= s2.length)
            return matrix[i][j] = ast && sol(s1, i + 2, s2, j, matrix);

        if (s1[i] == s2[j] || s1[i] == '.')
            return matrix[i][j] = (ast && (sol(s1, i + 2, s2, j, matrix) || sol(s1, i, s2, j + 1, matrix))) ||
                    sol(s1, i + 1, s2, j + 1, matrix);

        return matrix[i][j] = ast && sol(s1, i + 2, s2, j, matrix);
    }
    private static boolean ans(String regex, String s) {
        return sol(regex.toCharArray(), 0, s.toCharArray(), 0, new Boolean[regex.length() + 1][s.length() + 1]);
    }

    
}
