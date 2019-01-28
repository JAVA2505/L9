
public class DoubleLinkedList implements List {
    public DoubleLinkedList next = null;
    public DoubleLinkedList previous = null;
    public int value;

    public DoubleLinkedList(int value) {
        this.value = value;
    }

    private DoubleLinkedList first = null;
    private DoubleLinkedList last = null;

    @Override
    public void add(Integer elem) {
        DoubleLinkedList d = new DoubleLinkedList(elem);
        if (last == null) {
            first = d;
            last = d;

        }
    }


    @Override
    public void set(int index, Integer elem) {
        if (index < 0 || index > size() - 1) throw new IndexOutOfBoundsException();
//          DoubleLinkedList dll = get(index);
//          int y = dll.value;
//          dll.value = value;

    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            DoubleLinkedList cur = next;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.value;

        }
    }


    @Override
    public void clear() {
        next = null;
    }


    @Override
    public int size() {
        return value;
    }

    @Override
    public boolean isempty() {
        return next == null;
    }

    @Override
    public boolean contains(Integer elem) {
        boolean ourelem = false;
        DoubleLinkedList current = first.next;
        for (int i = 0; i < size(); i++) {
            if (current.equals(elem)) {
                ourelem = true;
            }
            current = current.next;
        }
        return ourelem;
    }

    @Override
    public int indexof(Integer elem) {
        DoubleLinkedList current = first;
        int result = 0;
        for (int i = 0; i < size(); i++) {
            if (elem.equals(current.value)) {
                result = i;

            }
            current = current.next;
        }
        return result;
    }

    @Override
    public int lastindexof(Integer elem) {
        DoubleLinkedList current = last;
        int result = 0;
        for (int i = 0; i < size() - 1; i--) {
            if (elem.equals(current.value)) {
                result = i;

            }
            current = current.next;
        }
        return result;
    }

    @Override
    public Integer remove(int index) {
        Integer num = null;
        if (index == 0 && size() > 1) {
            num = first.value;
            first.next.previous = null;
            first = first.next;
        } else if (index == size() - 1 && size() > 1) {
            num = last.value;
            last.previous.next = null;
            last = last.previous;
        } else if (index == 0 && size() == 1) {
            num = first.value;
            last = null;
            first = null;
        } else {
            DoubleLinkedList tmp;
            if (index < size() / 2) {
                tmp = first;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
            } else {
                tmp = last;
                for (int i = size() - 1; i >= index; i--) {
                    tmp = tmp.previous;
                }
            }
            num = tmp.next.value;
            tmp.next.next.previous = tmp;
            tmp.next = tmp.next.next;
        }
        return num;
    }

    @Override
    public void add(int index, Integer elem) {
        DoubleLinkedList dll = new DoubleLinkedList(elem);

        if (index == 0) {
            dll.next = first;
            first.previous = dll;
            first = dll;
        } else {
            DoubleLinkedList tmp;
            if (index < size() / 2) {
                tmp = first;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
            } else {
                tmp = last;
                for (int i = size() - 1; i >= index; i--) {
                    tmp = tmp.previous;
                }
            }
            dll.next = tmp.next;
            dll.previous = tmp;
            tmp.next.previous = dll;
            tmp.next = dll;

        }

    }
}