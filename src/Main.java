import java.util.List;
import java.util.*;

public class Main<T> {
    public static void main(String[] args) {
        Collection<String> c;
        List<Integer> l = new LinkedList<>();
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

    }

//    public T create(){
//        return new T();
//    }
}
