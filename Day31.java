public class Day31 {
    public static void main(String[] args) {
        System.out.println(minDistance("kitten","sitting"));
    }
    public static int minDistance(String s1, String s2) {
        if(s1.length()==0){
            return s2.length();
        }
        if(s2.length()==0){
            return s1.length();


        }

        char f=s1.charAt(0);
        char s=s2.charAt(0);

        if(f==s){
            return minDistance(s1.substring(1),s2.substring(1));
        }
        else{
            return 1+Math.min(minDistance(s1,s2.substring(1)),Math.min(minDistance(s1.substring(1),s2),minDistance(s1.substring(1),s2.substring(1))));
        }
    }
}
