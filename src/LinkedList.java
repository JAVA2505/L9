public class LinkedList implements List {

    private class Element {
        Integer elem;
        Element next = null;


        public Element(Integer elem) {

            this.elem = elem;
        }
    }

    int num = 0;
    private Element first = null;

    @Override
    public void add(Integer elem) {
        Element e = new Element(elem);
        if (first == null) {
            first = e;
        } else {
            Element tmp = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = e;
        }
        num++;
    }

    @Override
    public void add(int index, Integer elem) {
        Element e = new Element(elem);
        if (index == 0) {
            e.next = first;
            first = e;
        } else {
            Element tmp = first;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }

            e.next = tmp.next;
            tmp.next = e;
        }
        num++;
    }

    @Override
    public Integer remove(int index) {
        Element tmp = first;
        if (index == 0) {
            Integer out = first.elem;
            first = first.next;
            num--;
            return out;
        } else {
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            num--;

            Integer out = tmp.next.elem;
            tmp.next = tmp.next.next;
            return out;
        }

    }

    @Override
    public void set(int index, Integer elem) {
        Element tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.elem = elem;
    }

    @Override
    public Integer get(int index) {
        Element tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.elem;
    }

    @Override
    public void clear() {
        first = null;
        num = 0;
    }

    @Override
    public int size() {

        return num;
    }

    @Override
    public boolean isEmpty() {

        return num == 0;
    }

    @Override
    public boolean contains(Integer elem) {
        Element tmp = first;
        for (int i = 0; i < size(); i++) {
            if (tmp.elem.equals(elem)) {
                return true;
            }
            tmp = tmp.next;
        }

        return false;
    }

    @Override
    public int indexOf(Integer elem) {
        Element tmp = first;
        for (int i = 0; i < size(); i++) {
            if (tmp.elem.equals(elem)) {
                return i;
            }
            tmp = tmp.next;
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Integer elem) {
        Element tmp = first;
        int out = -1;
        for (int j = 0; j < num; j++) {
            if (tmp.elem.equals(elem)) {
                out = j;
            }
            tmp = tmp.next;
        }
        return out;
    }
}
