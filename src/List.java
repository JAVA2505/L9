public interface List {
    void add(Integer elem);

    void add(int index, Integer elem);

    Integer remove(int index);

    void set(int index, Integer elem);

    Integer get(int index);

    void clear();

    int size();

    boolean isempty();

    boolean contains(Integer elem);

    int indexof(Integer elem);

    int lastindexof(Integer elem);
}
