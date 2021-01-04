Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
You can assume that the messages are decodable. For example, '001' is not allowed.



class DecodeCount
{
    static int numberOfWays(char digits[], int n)
    {
        int count[] = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        if (digits[0] == '0') 
        {
            return 0;
        }
        for (int i = 2; i <= n; i++) 
        {
            count[i] = 0;
            if (digits[i - 1] > '0') 
            {
                count[i] = count[i - 1];
            }

            if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7')) 
            {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}

public class Main {


        // Driver Code
        public static void main (String[] args)
        {
            char digits[] = {'1','1','1'};
            int n = digits.length;
            System.out.println(DecodeCount.numberOfWays(digits, n));
        }


}
