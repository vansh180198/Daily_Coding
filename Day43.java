

public class Day43 {


    private int DEFAULT_SIZE=10;
    private int[] ar;
    private  int top;
    
    public Stacks(){
        this.ar=new int[DEFAULT_SIZE];
        this.top=0;
    }
    public boolean isfull(){
        return top==ar.length;
    }
    public void push(int element){
        if(isfull()){
            return;
        }
        
        
        ar[top++]=element;
    }
    public  boolean isEmpty(){
        return top==0;
    }
    public int pop() throws Exception{
        if(isEmpty()){

            throw new Exception("Empty") ;
        }
        int temp=ar[top-1];
        top--;
        return temp;
        }
        public int top(){
            return ar[top-1];
        }
    public int max(){
        int m=Integer.MIN_VALUE;
        for (int i = 0; i <top ; i++) {
            if(m<ar[i]){
                m=ar[i];
            }
        }
        return m;
    }
    }



