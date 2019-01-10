public class DoubleLinkedList implements List {

    private class Element {
        Integer elem;
        Element next = null;
        Element prev = null;

        Element(Integer elem) {
            this.elem = elem;
        }
    }

    private Element first = null;
    private Element last = null;

    @Override
    public void add(Integer elem) {
        Element e = new Element(elem);
        if (last == null) {
            first = e;
            last = e;
        } else {
            last.next = e;
            e.prev = last;
            last = e;
        }
    }

    @Override
    public void add(int index, Integer elem) {
        Element e = new Element(elem);
        //TODO: if last element added
        if (index == 0) {
            e.next = first;
            first.prev = e;
            first = e;
        } else {
            Element tmp;
            if (index < size() / 2) {
                tmp = first;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
            } else {
                tmp = last;
                for (int i = size() - 1; i >= index; i--) {
                    tmp = tmp.prev;
                }
            }
            e.next = tmp.next;
            e.prev = tmp;
            tmp.next.prev = e;
            tmp.next = e;
        }
    }

    @Override
    public Integer remove(int index) {
        Integer out = null;
        if (index == 0 && size() > 1) {
            out = first.elem;
            first.next.prev = null;
            first = first.next;
        } else if (index == size() - 1 && size() > 1) {
            out = last.elem;
            last.prev.next = null;
            last = last.prev;
        } else if (index == 0 && size() == 1) {
            out = first.elem;
            last = null;
            first = null;
        } else {
            Element tmp;
            if (index < size() / 2) {
                tmp = first;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
            } else {
                tmp = last;
                for (int i = size() - 1; i >= index; i--) {
                    tmp = tmp.prev;
                }
            }
            out = tmp.next.elem;
            tmp.next.next.prev = tmp;
            tmp.next = tmp.next.next;

        }
        return out;
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
