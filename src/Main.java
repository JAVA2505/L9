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

    }


//    public T create(){
//        return new T();
//    }
}
