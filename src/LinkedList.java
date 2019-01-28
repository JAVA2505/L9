public class LinkedList implements List {

    private class Element {
        Integer elem;
        Element next = null;

        public Element(Integer elem) {
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

        if (index == 0) {
            Integer out = first.elem;
            first = first.next;
            return out;
        } else {
            Element tmp = first;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            Integer out = tmp.next.elem;
            tmp.next = tmp.next.next;
            return out;
        }
    }

    @Override
    public void set(int index, Integer elem) {
        Element e = new Element(elem);
        while (e.next != null) {
            if (e.next.equals(index))
                e.next = new Element(elem);

        }
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
        int b = 0;
        Element tmp = first;
        while (tmp != null) {
            b++;
            tmp = tmp.next;
        }
        return b;
    }

    @Override
    public boolean isempty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public boolean contains(Integer elem) {
        Element n = new Element(elem);
        while (n.next != null) {
            if (n.equals(elem)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexof(Integer elem) {
        Element e = new Element(elem);
        int b = 0;
        while (e.next != null) {
            if (e.equals(elem)) {
                return b;
            }
            b++;
        }
        return -1;
    }

    @Override
    public int lastindexof(Integer elem) {
        Element tmp = first;
        int last = -1;
        for (int i = 0; i < 0; i++) {
            if (tmp.elem.equals(elem))
                last = i;
        }
        tmp = tmp.next;
        return last;
    }


}