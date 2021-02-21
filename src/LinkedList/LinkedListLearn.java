package LinkedList;

import java.util.LinkedList;

public class LinkedListLearn {

    public static void main(String[] args){
        LinkedList<Integer> lst=new LinkedList<>();
        LinkedList<Integer> lst2=new LinkedList<>();
        for (int i=1;i<=5;i++){
            lst.add(i);

        }
        System.out.println(lst);

        //time complexity- 0[n/2]
        //space complexity-0[1]

        int p1=0,p2=lst.size()-1; int temp=0;

        while (p1<p2){
            temp=lst.listIterator(p2).next();
            lst.set(p2,lst.listIterator(p1).next());
            lst.set(p1,temp);
            p1++;
            p2--;
        }
        System.out.println(lst);
        //by using another list
        /*for (int i=lst.size()-1;i>=0;i--){
            lst2.add(lst.get(i));
        }
        System.out.println(lst2);*/
    }

}
