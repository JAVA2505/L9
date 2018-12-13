public class ArrayList implements List {

    private Integer[] mas = new Integer[0];

    @Override
    public void add(Integer elem) {
        Integer[] tmp = new Integer[mas.length + 1];
//        for(int i = 0; i < mas.length; i++){
//            tmp[i] = mas[i];
//        }
        System.arraycopy(mas, 0, tmp, 0, mas.length);
        tmp[tmp.length - 1] = elem;
        mas = tmp;
    }

    @Override
    public void add(int index, Integer elem) {
        Integer[] tmp = new Integer[mas.length + 1];
//        for(int i = 0; i < mas.length; i++){
//            tmp[i] = mas[i];
//        }
        System.arraycopy(mas, 0, tmp, 0, index);
        tmp[index] = elem;
        System.arraycopy(mas, index, tmp, index + 1, mas.length - index);
        mas = tmp;
    }

    @Override
    public Integer remove(int index) {
        Integer[] tmp = new Integer[mas.length + 1];
        System.arraycopy(mas, 0, tmp, 0, index);
        System.arraycopy(mas, index + 1, tmp, index, mas.length - index - 1);
        Integer out = mas[index];
        mas = tmp;
        return out;
    }

    @Override
    public void set(int index, Integer elem) {

    }

    @Override
    public Integer get(int index) {
        return mas[index];
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
