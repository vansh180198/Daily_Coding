import java.util.*;
import java.lang.*;
import java.io.*;

class Day27 {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.nextLine());
		while(t>0){
		    String str=s.nextLine();
		    Boolean ans=bala(str);
		    if(ans==true){
		        System.out.println("balanced");
		    }
		    else{
		        System.out.println("not balanced");
		    }
		    
		    t--;
		}
	}
	
	public static boolean bala(String str){
	    Stack sta=new Stack();
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
	            sta.push(str.charAt(i));
	        }
	        else if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')'){
	            if(sta.isEmpty()){
	                return false;
	            }
	            else if(!mathcingpair(str.charAt(i),(char)sta.pop())){
	                return false;
	            }
	        }
	        
	    }
	    if(sta.isEmpty()){
	        return true;
	    }
	    return false;
	    
	    
	}
	public static boolean mathcingpair(char ch,char cc){
	    if(cc=='{' && ch=='}'){
	        return true;
	    }
	    if(cc=='(' && ch==')'){
	        return true;
	    }
	    if(cc=='[' && ch==']'){
	        return true;
	    }
	    return false;
	}
}
