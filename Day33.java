import java.util.ArrayList;
import java.util.PriorityQueue;

public class Day33 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(0);
        list.add(5);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a, b)->b-a);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for (int i = 0; i <list.size() ; i++) {


            int c= (int) list.get(i);
            pq1.add(c);

            if (pq1.size() != pq2.size()) {
                pq2.add(pq1.poll());
                System.out.println(pq2.peek());
            } else {
                pq1.add(pq2.poll());
                pq2.add(pq1.poll());
                System.out.println((pq1.peek() + pq2.peek()) / 2.0);
            }
        }


    }


}
