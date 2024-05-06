import java.util.*;

public class Arraylist_java {
    public static void main(String[] args) {
    /*    ArrayList<String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        //Traversing list through Iterator
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //accessing element using get and set
        System.out.println(al.get(0));
        //chenging element
        al.set(1,"Dates");
        ListIterator<String> itr_rev = al.listIterator(al.size());
        while(itr_rev.hasPrevious()){
            String element = itr_rev.previous();
            System.out.println(element);
        }
        ArrayList<String> list2=new ArrayList<String>();
        System.out.println("Initial list of elements: "+list2);
        //Adding elements to the end of the list
        list2.add("Ravi");
        list2.add("Vijay");
        list2.add("Ajay");
        list2.addAll(al);//combining two collections
        //removing element
        list2.remove("Ravi");
        //applying condition
        list2.removeIf(str -> str.charAt(0)=='A');
        for(String e : list2) System.out.println(e);
*/
        List<Integer> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            if(a==0)
        }
        for(Integer e : lst) System.out.println(e);
    }
}
