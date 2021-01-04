//Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.
//
//        For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb"
import java.util.HashMap;

public class Day13 {
    public static void main(String[] args) {
      String str="abcba";
      int k=2;
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int b=0;
        int max=0;
        String maxstring="";
        while (l<str.length()){
            char ch=str.charAt(l);
            l++;

            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size()<=k){
                String ans=str.substring(b,l);
            if(ans.length()>max ){
                max=map.size();
                maxstring=str.substring(b,l);

            }}
            if(str.substring(b,l).length()>k){

                if(map.get(str.charAt(b))>1){
                    map.put(str.charAt(b),map.get(str.charAt(b))-1);
                }
                else{
                    char del=str.charAt(b);
                    map.remove(str.charAt(b));


                }
                b++;
            }



        }
        System.out.println(maxstring);

    }
}
