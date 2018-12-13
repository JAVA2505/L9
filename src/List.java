public interface List {
    void add(Integer elem);

    void add(int index, Integer elem);

    Integer remove(int index);

    void set(int index, Integer elem);

    Integer get(int index);

    void clear();

    int size();

    boolean isEmpty();

    boolean contains(Integer elem);

    int indexOf(Integer elem);

    int lastIndexOf(Integer elem);
}
