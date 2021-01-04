import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day11 {
    public static void main(String[] args) {
        String A="x";
        HashMap<Character,Integer> map=new HashMap<>();

        int maxdiff=Integer.MAX_VALUE;
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='x'){
                if(map.containsKey('o')){
                    int a=map.get('o');
                    int diff=i-a;
                    if(diff<maxdiff){
                        maxdiff=diff;
                    }
                    map.put('x',i);
                }
                else{
                    map.put('x',i);
                }

            }
            else if(ch=='o'){
                if(map.containsKey('x')){
                    int a=map.get('x');
                    int diff=i-a;
                    if(diff<maxdiff){
                        maxdiff=diff;
                    }
                    map.put('o',i);
                }
                else{
                    map.put('o',i);
                }
            }
        }
        if(maxdiff==Integer.MAX_VALUE){
            System.out.println(-1);  
        }
        else{
            System.out.println(maxdiff);
        }
    }
}
