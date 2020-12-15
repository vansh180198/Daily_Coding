import java.util.HashSet;

public class Day1 {
    public static void main(String[] args) {
        int[] arr={10,15,3};
        int k=17;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {

            if(set.contains(k-arr[i])){
                System.out.println(true);
                return;
            }

            else{
                set.add(arr[i]);
            }
        }
        System.out.println(false);
    }
}
