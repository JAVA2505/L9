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
        return null;
    }

    @Override
    public void set(int index, Integer elem) {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Integer elem) {
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
