import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TestCollect1 {

    public static void main(String[] args){

        //ArrayList<Integer> mylist = new ArrayList<>();
        //Vector<Integer> mylist = new Vector<>();

        LinkedList<Integer> mylist = new LinkedList<>();

        mylist.add(5);
        mylist.add(7);
        mylist.add(10);

        mylist.remove(new Integer(7));

        System.out.println(mylist);


        for (Integer i : mylist){
            System.out.println(i);
        }

    }
}
