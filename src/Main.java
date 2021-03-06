import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main<T> {
    public static void main(String[] args) {
        Collection<String> c;
        java.util.List<Integer> l = new java.util.LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(-10);
        l.add(0);
        l.sort((o1, o2) -> {
            if (o1 == o2) {
                return 0;
            }
            return o1 < o2 ? -1 : 1;
        });
        System.out.println(l.toString());
        Set<String> s;
        Map<Double, String> m;
        Queue<String> q;

        System.out.println("====================");

        List o = new ArrayList();
        o.add(23);
        o.add(34);
        o.add(51);
        o.add(1, 88);
        System.out.println(o.size());
        o.remove(2);
        for (int i = 0; i < o.size(); i++) {
            System.out.println(o.get(i));
        }

        System.out.println(o.indexOf(9));

        System.out.println(o.indexOf(23));
        System.out.println(o.lastIndexOf(51));
        System.out.println("==========================");

        List u = new LinkedList();
       // System.out.println(u.isEmpty());
        u.add(23);
        u.add(34);
        u.add(51);
        u.add(77);
        u.add(100);
        u.add(34);
        u.add(1, 88);
       // System.out.println(u.size());
      //  System.out.println(u.remove(0));
      //  System.out.println(u.remove(2));

        for (int i = 0; i < u.size(); i++) {
            System.out.println(u.get(i));
        }
        System.out.println("==========================");
      //  u.remove(0);
        System.out.println(u.contains(100));
        System.out.println(u.indexOf(100));
        System.out.println(u.lastIndexOf(34));
        System.out.println(u.lastIndexOf(51));
        System.out.println(u.lastIndexOf(88));
        System.out.println(u.lastIndexOf(23));
        System.out.println(u.lastIndexOf(10));

      //  System.out.println(u.remove(4));
      //  u.remove(5);
        u.set(1,55);
        u.set(3,45);
//        System.out.println(u.size());
//        System.out.println(u.get(1));
//        System.out.println(u.get(3));
        System.out.println("==========================");
        for (int i = 0; i < u.size(); i++) {
           System.out.println(u.get(i));
        }
        System.out.println(u.isEmpty());
     //   System.out.println(u.get(0));
     //   System.out.println(u.get(1));
    }


//    public T create(){
//        return new T();
//    }
}
