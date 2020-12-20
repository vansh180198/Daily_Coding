public class Day5 {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        Cons obj1=new Cons(a,b);
        System.out.println(obj1.car());
        System.out.println(obj1.cdr());
    }


}

public class Cons {
    int a;
    int b;
    public Cons(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int  car(){
        return a;
    }
    public int cdr(){
        return b;
    }
}
