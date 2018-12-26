public class LinkedList implements List {

    private class Element {
        Integer elem;
        Element next = null;

        public Element(Integer elem) {
            this.elem = elem;
        }

        public Element() {
            this.elem = elem;
        }
    }

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
    }

    @Override
    public Integer remove(int index) {

        if (index ==0) {
            next = first;            ;
        }else {
            for  (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
        }
            return null;
    }

    @Override
    public void set(int index, Integer elem) {


    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Integer elem) {
        for (int i = 0; i < size(); i++) {
            if (i == elem) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Integer elem) {
        return 0;
    }

    @Override
    public int lastIndexOf(Integer elem) {
        return 0;
    }
}
