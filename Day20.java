//Intersection of two LinkedList

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         ListNode Current1=headA,Current2=headB;    // initialising temporary elements
        int size1=0,size2=0;
        while(Current1!=null)                       //find length of both lists
        {
            Current1=Current1.next;
            size1++;
        }
        while(Current2!=null)
        {
            Current2=Current2.next;
            size2++;
        }
        Current1=headA;
        Current2=headB;
/*If both lists are of same length, simple re traverse both the list. wherever the nodes are equals, return that node. If at no point nodes are equal,means there is no intersection and return null*/
        if(size1==size2)
        {
            while(Current1!=null&&Current2!=null)
            {
                if(Current1==Current2)
                    return Current1;
                Current1=Current1.next;
                Current2=Current2.next;
            }
            return null;
        }
/*If lists are of unequal length, we set pointer of longer list at 'move' distance from its head. Now,from this point of longer list, and from head of smaller list, both Lists are equal. And thus we simply traverse the lists and if both pointers are equal at any point, just return that node. If at no point are the two pointers equal, the lists have no intersection and thus return null.
example--->      List 1--->    1-2-3-4-5-6
                 List 2--->    7-3-4-5-6
Thus lists have intersection at Node '3'. Length of List 1 is 6 and that is List 2 is 5. So we move pointer Current 1 ahead by (6-5)=1 step ahead. Thus Current1 will be initialised at node '2'. now traverse and get the answer.*/
        if(size1>size2)
        {
            int move=size1-size2;
            while(move>0)
            {
                Current1=Current1.next;
                move--;
            }
            while(Current1!=null&&Current2!=null)
            {
                if(Current1==Current2)
                    return Current1;
                Current1=Current1.next;
                Current2=Current2.next;
            }
            return null;
        }
        else
        {
            int move=size2-size1;
            while(move>0)
            {
                Current2=Current2.next;
                move--;
            }
            while(Current1!=null&&Current2!=null)
            {
                if(Current1==Current2)
                    return Current1;
                Current1=Current1.next;
                Current2=Current2.next;
            }
            return null;
        }
    }
}
