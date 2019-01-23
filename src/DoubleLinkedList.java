public class DoubleLinkedList implements List {

    private class Element {
        Integer elem;
        Element next = null;
        Element prev = null;

        Element(Integer elem) {
            this.elem = elem;
        }
    }
    private int num = 0;
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
        num++;
    }

    @Override
    public void add(int index, Integer elem) {
        Element e = new Element(elem);
        //TODO: if last element added
        if (index == 0) {
            e.next = first;
            first.prev = e;
            first = e;
        }else
        if (index == size()) {
            e.prev = last;
            last.next=e;
            last = e;
        }
        else {
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
        num++;
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
        num--;
        return out;
    }

    @Override
    public void set(int index, Integer elem) {

            Element tmp;
            if (index < size() / 2) {
                tmp = first;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
            } else {
                tmp = last;
                for (int i = size() - 1; i >= index+1; i--) {
                    tmp = tmp.prev;
                }
            }
            tmp.elem = elem;


    }

    @Override
    public Integer get(int index) {
        Element tmp;
        if (index < size() / 2) {
            tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } else {
            tmp = last;
            for (int i = size() - 1; i >= index+1; i--) {
                tmp = tmp.prev;
            }
        }

        return tmp.elem;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
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
        Element tmp = last;
        for (int i = size()-1; i < size(); i--) {
            if (tmp.elem.equals(elem)) {
                return i;
            }
            tmp = tmp.prev;
        }
        return -1;
    }
}
