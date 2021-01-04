//There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
//
//        For example, if N is 4, then there are 5 unique ways:
//
//        1, 1, 1, 1
//        2, 1, 1
//        1, 2, 1
//        1, 1, 2
//        2, 2
//        What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
public class Day12 {
    public static void main(String[] args) {
        int N=4;
        int nas=roll(N);
        System.out.println(nas);
    }
    public static int roll(int target){
        if(target==0){
            return 1;
        }
        int cnt=0;
        for (int i = 1; i <=2 && i<=target ; i++) {
            cnt+=roll(target-i);
        }
        return cnt;
    }
}
